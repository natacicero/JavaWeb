package br.estudo.teste;

import br.estudo.dao.UsuarioDao;
import br.estudo.modelo.Usuario;

public class TesteAlterarUsuario {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		usuario.setId(10);
		usuario.setNome("nycolas");
		usuario.setLogin("nyck");
		usuario.setSenha("nk123");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.alterar(usuario);
		
		System.out.println("Usuario Alterado com Sucesso!!!");
		
	}

}
