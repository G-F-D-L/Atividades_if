public class ClienteOuroVip extends Cliente {
    
    private String endereco;

    private String numeroDoCartao;

    public ClienteOuroVip(String nome, double valorDaCompra, String endereco, String numeroDoCartao){
        super(nome, valorDaCompra);
        this.endereco = endereco;
        this.numeroDoCartao = numeroDoCartao;
    }

    public double calcularPagamento() {
        return super.getValorDaCompra() * 0.85;
    }

    public String toString() {
        return super.toString() + " | Cartão: " + numeroDoCartao + " | Endereço: " + endereco + " | OURO VIP";
    }
    
}
