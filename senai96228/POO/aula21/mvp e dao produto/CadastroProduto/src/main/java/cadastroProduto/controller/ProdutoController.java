/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroProduto.controller;

import cadastroProduto.dao.ProdutoDAO;
import cadastroProduto.model.Produto;
import java.util.List;

/**
 *
 * @author Emilia
 */
public class ProdutoController {
    private final ProdutoDAO produtoDao;

    public ProdutoController() {
        this.produtoDao = new ProdutoDAO();
    }

    public String cadastrarProduto(String nome, String categoria, String precoTxt, String qtdTxt) {
        if (nome.isEmpty() || categoria.isEmpty() || precoTxt.isEmpty() || qtdTxt.isEmpty()) {
            return "Preencha todos os campos.";
        }
        try {
            double preco = Double.parseDouble(precoTxt);
            int qtd = Integer.parseInt(qtdTxt);
            
            Produto p = new Produto(0, nome, categoria, preco, qtd);
            produtoDao.cadastrar(p);
            return "Produto cadastrado com sucesso!";
        } catch (NumberFormatException e) {
            return "Quantidade ou preço inválido.";
        }
    }

    public String obterListaProdutos() {
        List<Produto> lista = produtoDao.listarTodos();
        if (lista.isEmpty()) {
            return "Nenhum Produto cadastrado.";
        }
        return lista.toString();
    }

    public String pesquisarProduto(String idTxt) {
        if (idTxt.isEmpty()) {
            return "Digite o id em 'busca' para pesquisar.";
        }
        try {
            int id = Integer.parseInt(idTxt);
            Produto p = produtoDao.buscarPorId(id);
            if (p != null) {
                return p.toString();
            }
            return "Produto não encontrado.";
        } catch (NumberFormatException e) {
            return "ID inválido.";
        }
    }

    public String alterarProduto(String idTxt, String nome, String categoria, String precoTxt, String qtdTxt) {
        if (idTxt.isEmpty() || nome.isEmpty() || categoria.isEmpty() || precoTxt.isEmpty() || qtdTxt.isEmpty()) {
            return "Preencha todos os campos.";
        }
        try {
            int id = Integer.parseInt(idTxt);
            double preco = Double.parseDouble(precoTxt);
            int qtd = Integer.parseInt(qtdTxt);

            Produto p = new Produto(id, nome, categoria, preco, qtd);
            if (produtoDao.alterar(p)) {
                return "Dados atualizados com sucesso!";
            }
            return "Produto não encontrado.";
        } catch (NumberFormatException e) {
            return "Preço ou quantidade inválida.";
        }
    }

    public String removerProduto(String idTxt) {
        if (idTxt.isEmpty()) {
            return "Digite o id em 'busca' para remover.";
        }
        try {
            int id = Integer.parseInt(idTxt);
            if (produtoDao.remover(id)) {
                return "Produto removido com sucesso!";
            }
            return "Produto não encontrado.";
        } catch (NumberFormatException e) {
            return "ID inválido.";
        }
    }
    
    public boolean efetuarLogin(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }
}
