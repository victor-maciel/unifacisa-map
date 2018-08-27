package br.edu.unifacisa.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = ConexaoBancoDados.conexao();
		try {
			String query = "Select * from users";
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}

		} catch(Exception e) {
			System.out.println("Aconteceu algum erro durante a conexao");
			
		}
	}

}
