import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario implements Contratacao{
  private final double PREMIO;
  private List<Funcionario> funcionariosContratados;

  public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, double PREMIO){
    super(nome, dataNascimento, sexo, setor, salarioBase);
    this.PREMIO = PREMIO;
    this.funcionariosContratados = new ArrayList<>();
  }

  @Override
  public void admitir(Funcionario funcionario){
    funcionariosContratados.add(funcionario);
  }

  @Override
  public void demitir(Funcionario funcionario){
    if(funcionariosContratados.remove(funcionario)){
      System.out.println("Funcionario " + funcionario.getNome() + " foi demitido pelo diretor " + this.getNome());
    } 
  }

  public List<Funcionario> getFuncionariosContratados(){
    return funcionariosContratados;
  }

  @Override
  public String toString(){
    return "Diretor: " + "\n" +
      super.toString() + "\n" +
           "salarioFinal: " + this.getSalarioFinal() + "\n" +
           "Funcionarios contratados: " + "\n" +
           funcionariosContratados ;
  }

  @Override
  public double getSalarioFinal() {
    double acrescimo = super.salarioBase + this.PREMIO;
    return super.salarioBase + acrescimo;
  }
}
