package Sistema_Pagamentos;

public abstract class Pagamentos {
    private String nomeCliente;
    private Double valor;

    public Pagamentos(String nomeCliente, double valor) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public abstract double processarPagamento();

    public String toString() {
        return " Nome" + nomeCliente + " Valor do pagamento" + valor;
    }
    
}
