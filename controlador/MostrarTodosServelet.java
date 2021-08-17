package br.estudo.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.estudo.dao.UsuarioDao;
import br.estudo.modelo.Usuario;

@WebServlet("/mostrarusuarios")
public class MostrarTodosServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.mostrarTodosUsuarios();
		List<Usuario> usuarios = usuarioDao.mostrarTodosUsuarios();
		
		request.setAttribute("listaDeUsuarios", usuarios);
		request.getRequestDispatcher("mostrarusuarios.jsp").forward(request, response);
		
		
	}

}
