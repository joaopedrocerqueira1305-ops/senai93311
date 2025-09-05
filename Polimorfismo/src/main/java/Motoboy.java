public class Motoboy extends Funcionario{
  private String carteiradeHabilitacao;

  public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiradeHabilitacao){
    super(nome, dataNascimento, sexo, setor, salarioBase);
    this.carteiradeHabilitacao = carteiradeHabilitacao;
  }

  @Override
  public String toString(){
    return super.toString() + "\n" +
           "Carteira de Habilitacao: " + carteiradeHabilitacao + "\n";
  }
}