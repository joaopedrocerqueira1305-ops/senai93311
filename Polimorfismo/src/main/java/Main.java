

public class Main {
  public static void main(String[] args) {
   Motoboy m1 = new Motoboy("Joao", "01/01/2000", Sexo.Masculino, Setor.OPERACOES, 1500, "123456");
    Motoboy m2 = new Motoboy("Maria", "01/04/2001", Sexo.Feminino, Setor.FINANCEIRO , 1500, "123456");
    Diretor d1 = new Diretor("Jose", "01/01/2000", Sexo.Masculino, Setor.RECURSOSOS_HUMANOS, 5000, 0.2);
    d1.admitir(m1);
    d1.admitir(m2);
    System.out.println(d1);
    d1.demitir(m1);
    System.out.println(d1);
    
  }
}