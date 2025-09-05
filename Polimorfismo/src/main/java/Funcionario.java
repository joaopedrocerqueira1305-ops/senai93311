public abstract class Funcionario{
  private String nome;
  private String dataNascimento;
  private Sexo sexo;
  private Setor setor;
  private double salarioBase;

  public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase){
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.sexo = sexo;
    this.setor = setor;
    this.salarioBase = salarioBase;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getDataNascimento(){
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento){
    this.dataNascimento = dataNascimento;
  }
  public Sexo getSexo(){
    return sexo;
  }
  public void setSexo(Sexo sexo){
    this.sexo = sexo;
  }
  public Setor getSetor(){
    return setor;
  }
  public void setSetor(Setor setor){
    this.setor = setor;
  }
  public double getSalarioBase(){
    return salarioBase;
  }
  public void setSalarioBase(double salarioBase){
    this.salarioBase = salarioBase;
  }

  @Override
  public String toString(){
    return "Nome: " + nome + "\n" + 
           "Data de Nascimento: " + dataNascimento + "\n" +
           "Sexo: " + sexo + "\n" +
           "Setor: " + setor + "\n" +
           "Salario Base: " + salarioBase;
  }
}