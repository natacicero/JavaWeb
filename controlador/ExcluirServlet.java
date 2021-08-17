package br.estudo.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.estudo.dao.UsuarioDao;

@WebServlet("/excluirusuario")
public class ExcluirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.excluir(id);
		
		response.sendRedirect("http://localhost:8181/javaweb_turmasimm_manha/mostrarusuarios");
		
	}

}
