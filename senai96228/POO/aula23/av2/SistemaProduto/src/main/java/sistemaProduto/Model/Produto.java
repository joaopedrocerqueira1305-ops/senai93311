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
    private int id;
    private String nome;
    private int quantidade;
    private Double preco;
    private Usuario responsavel;
    
    public Produto(){
    }

    public Produto(int id, String nome, String senha) {
        super(id, nome, senha);
    }

    public Produto(String nome, String senha) {
        super(nome, senha);
    }

    public Produto(int id, String nome, int quantidade, Double preco, Usuario responsavel) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.responsavel = responsavel;
    }

    public Produto(String nome, int quantidade, Double preco, Usuario responsavel) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.responsavel = responsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }
    
    
}
