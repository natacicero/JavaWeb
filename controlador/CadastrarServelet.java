package br.estudo.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.estudo.dao.UsuarioDao;
import br.estudo.modelo.Usuario;

@WebServlet("/cadastrarusuario")
public class CadastrarServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando  o método GET!!!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando o método POST!!!");
		
	String nome = request.getParameter("txtnome");
	String login = request.getParameter("txtlogin");
	String senha = request.getParameter("txtsenha");
	
	Usuario usuario = new Usuario();
	
	usuario.setNome(nome);
	usuario.setLogin(login);
	usuario.setSenha(senha);
	
	UsuarioDao usuarioDao = new UsuarioDao();
	usuarioDao.cadastrar(usuario);
	
	response.sendRedirect("localhost:8181/javaweb_turmasimm_manha/mostrarusuarios");
	
	}

}
