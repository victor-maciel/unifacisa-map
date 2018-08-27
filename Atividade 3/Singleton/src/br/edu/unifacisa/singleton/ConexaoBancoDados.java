package br.edu.unifacisa.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBancoDados {
	
	private ConexaoBancoDados() {}
	public static Connection conexao = null;
	
	public static synchronized  Connection conexao() {
		System.out.println("Conectando ao banco de dados");
		try {
			
			if(conexao == null) {
				Class.forName("org.postgresql.Driver");
				conexao = DriverManager.getConnection("\"jdbc:postgresql://localhost/sicoc\"", "usuario", "senha");
				System.out.println("Conectado...");
			}
			
		} catch(SQLException e) {
			
			System.out.println(e);
			throw new RuntimeException(e);
			
		} catch (ClassNotFoundException n) {
			System.out.println(n);
		}
	
		return conexao;
	}
	
}
