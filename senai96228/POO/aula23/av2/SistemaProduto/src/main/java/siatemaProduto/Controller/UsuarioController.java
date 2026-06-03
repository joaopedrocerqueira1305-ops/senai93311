/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siatemaProduto.Controller;

import java.util.ArrayList;
import siatemaProduto.Dao.UsuarioDao;
import sistemaProduto.Model.Usuario;

/**
 *
 * @author aluno.den
 */
public class UsuarioController {
    private UsuarioDao dao = new UsuarioDao();

    public void cadastrar(Usuario usuario) {
    dao.inserir(usuario);
    }


    public ArrayList<Usuario> listar() {
        return dao.listar();
    }
}
