public class ClientePj extends Cliente {
    private String cnpj;
    public ClientePj(int codigo, String nome, String endereco, String cnpj){
        super(codigo, nome, endereco);
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("O cnpj é "+getCnpj());
    }
}