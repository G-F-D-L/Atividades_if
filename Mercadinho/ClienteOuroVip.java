public class ClienteOuroVip extends Cliente {
    
    private String endereço;

    private String numeroDoCartao;

    public ClienteOuroVip(String nome, double valorDaCompra, String endereço, String numeroDoCartao){
        super(nome, valorDaCompra);
        this.endereço = endereço;
        this.numeroDoCartao = numeroDoCartao;
    }

    public double calcularPagamento() {
        return this.calcularPagamento() * 0.85;
    }
}
