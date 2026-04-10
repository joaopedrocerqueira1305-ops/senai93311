package aula14.pagamento;

public class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " com Cartão de Crédito.");
    }

}
