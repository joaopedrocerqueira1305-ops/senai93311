/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaProduto.Model;

/**
 *
 * @author aluno.den
 */
public class Produto extends Usuario{
    private int id_produto;
    private String nome;
    private int quantidade;
    private Double preco;
    private Usuario idUsuario;
    
    public Produto(){
    }

    public Produto(int id, String nome, String senha) {
        super(id, nome, senha);
    }

    public Produto(String nome, String senha) {
        super(nome, senha);
    }

    public Produto(int id_produto, String nome, int quantidade, Double preco, Usuario idUsuario) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.idUsuario = idUsuario;
    }

    public Produto(String nome, int quantidade, Double preco, Usuario idUsuario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.idUsuario = idUsuario;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }   
}