public class ClienteOuroVip extends ClienteVip {
    
    private String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, String endereco, String numeroDoCartao){
        super(nome, valorDaCompra, numeroDoCartao);
        this.endereco = endereco;
    }

    public double calcularPagamento() {
        return super.getValorDaCompra() * 0.85;
    }

    public String toString() {
        return super.toString() + " Endereço: " + endereco + " Cliente OURO VIP";
    }
    
}
