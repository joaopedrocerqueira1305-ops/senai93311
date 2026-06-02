/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtosCadastro.Controller;

import java.util.ArrayList;
import produtosCadastro.Dao.ProdutoDao;
import produtosCadastro.Model.Produto;

/**
 *
 * @author aluno.den
 */
public class ProdutoController {
    private ProdutoDao dao = new ProdutoDao();

    public void cadastrar(Produto produto) {
    dao.inserir(produto);
    }


    public ArrayList<Produto> listar() {
        return dao.listar();
    }
    public void atualizar(int id, String nome, String categoria, double preco, int quantidade) {
        Produto p = new Produto(id,nome, categoria, preco, quantidade);
        dao.atualizar(p);
    }

    public void remover(int id) {
        dao.remover(id);
    }
    
    public ArrayList<Produto> buscarPorNome(String nome) {
        return dao.buscarPorNome(nome);
    }

}