package aula14.pagamento;

public class Pix implements Pagamento {
    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " realizado via Pix.");
    }

}
