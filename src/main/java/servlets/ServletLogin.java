package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelLogin;

@WebServlet("/ServletLogin") // Mapeamento da tela
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLogin() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// código do método doGet
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// código do método doPost

		String login = (request.getParameter("login"));
		String senha = (request.getParameter("senha"));

		if (login != null && !login.isEmpty() && senha != null && !senha.isEmpty()) {

			ModelLogin modellogin = new ModelLogin();
			modellogin.setLogin(login); 
			modellogin.setSenha(senha);

		} else {
			RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msgm", "Informe o login e a senha correta!");
			redirecionar.forward(request, response);
			
		}

	}

}
