package br.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fiap.conexao.Conexao;
import br.fiap.entidade.Contato;

public class ContatoDAO {
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	public ContatoDAO() {
		connection = Conexao.conectar();
	}
	
	public void inserir(Contato contato) {
		sql = "insert into agenda2sis values(?, ?, ?)";
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getEmail());
			ps.setString(3, contato.getFone());
			ps.execute();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public List<Contato> listar() {
		List<Contato> lista = new ArrayList<Contato>();
		sql = "select * from agenda2sis";
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				lista.add(new Contato(rs.getString("nome"), rs.getString("email"), rs.getString("fone")));
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return lista;
	}
}
