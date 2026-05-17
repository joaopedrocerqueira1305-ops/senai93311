/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroProduto.dao;

import cadastroProduto.model.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emilia
 */
public class ProdutoDAO {
    private static final List<Produto> listaProduto = new ArrayList<>();
    int id = 0;

    public void cadastrar(Produto produto) {
        id++;
        produto.setId(id);
        listaProduto.add(produto);
    }

    public List<Produto> listarTodos() {
        return listaProduto;
    }

    public Produto buscarPorId(int idBusca) {
        for (Produto p : listaProduto) {
            if (p.getId() == idBusca) {
                return p;
            }
        }
        return null;
    }

    public boolean alterar(Produto produtoAtualizado) {
        Produto p = buscarPorId(produtoAtualizado.getId());
        if (p != null) {
            p.setNome(produtoAtualizado.getNome());
            p.setCategoria(produtoAtualizado.getCategoria());
            p.setPreco(produtoAtualizado.getPreco());
            p.setQuantidade(produtoAtualizado.getQuantidade());
            return true;
        }
        return false;
    }

    public boolean remover(int idBusca) {
        Produto p = buscarPorId(id);
        if (p != null) {
            listaProduto.remove(p);
            return true;
        }
        return false;
    }
}