/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siatemaProduto.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import sistemaProduto.Conexao.ConexaoBanco;
import sistemaProduto.Model.Usuario;

/**
 *
 * @author aluno.den
 */
public class UsuarioDao {
    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, senha) VALUES (?, ?)";
        try (Connection conn = ConexaoBanco.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> listar() {
        ArrayList<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try (Connection conn = ConexaoBanco.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Usuario p = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("senha")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}