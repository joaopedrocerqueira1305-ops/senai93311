/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro.Controle;

import com.mycompany.cadastro.Dao.PessoaDao;
import com.mycompany.cadastro.Modelo.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class PessoaControle {
    private PessoaDao dao = new PessoaDao();

    public void cadastrar(Pessoa pessoa) {
    dao.inserir(pessoa);
    }

    public ArrayList<Pessoa> listar() {
        return dao.listar();
    }

    public void atualizar(int id, String nome, int idade) {
        Pessoa p = new Pessoa(id,nome, idade);
        dao.atualizar(p);
    }

    public void remover(int id) {
        dao.remover(id);
    }
    
    public ArrayList<Pessoa> buscarPorNome(String nome) {
    return dao.buscarPorNome(nome);
}

}
