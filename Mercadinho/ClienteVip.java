public class ClienteVip extends Cliente {

    private String numeroDoCartao;

    public ClienteVip(String nome, double valorDaCompra, String numeroDoCartao){
        super(nome, valorDaCompra);
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }


    public double calcularPagamento() {
        return super.getValorDaCompra() * 0.9;
    }

     public String toString() {
        return super.toString() + " Cartão: " + numeroDoCartao + " Cliente VIP";
    }
}
