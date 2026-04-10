public class Vendedor extends Funcionario {
    private Double comissao;

    public Vendedor(String nome, Double salarioBase, Double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salario final: "+ (getSalarioBase() + comissao)); 
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Vendedor");
        System.out.println("Comissão: " + comissao);
    }

}
