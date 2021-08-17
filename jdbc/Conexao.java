package br.estudo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection receberConexao() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_teste","root","39934314");
		System.out.println("Banco de Dados Conectado com Sucesso!!!");
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println("Não foi possivel conectar ao Banco de Dados!!!");
			e.printStackTrace();
		}
		
		return con;
	}
	

}
