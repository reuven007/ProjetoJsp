package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionBanco {
	private static String banco = "jdbc:mysql://localhost:3307/projetojsp?autoReconnect=true";
	private static String user = "mysql";
	private static String senha = "123456";
	private static Connection connection = null;

	public static Connection getConnection() {
		return connection;
	}

	static {
		conectar();
	}

	public SingleConnectionBanco() {
		conectar();
	}

	private static void conectar() {
		try {
			if (connection == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(banco, user, senha);
				connection.setAutoCommit(false);
			}
		} catch (Exception e) {
			e.printStackTrace(); // Mostrar qualquer erro ao se conectar
		}
	}
}
