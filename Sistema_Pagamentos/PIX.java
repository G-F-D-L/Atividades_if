package Sistema_Pagamentos;

public class PIX extends Pagamentos{

    public PIX(String nomeCliente, double valor) {
        super(nomeCliente, valor);
    }

    public double processarPagamento() {
        return getValor(); // sem taxas
    }
    
    public String toString() {
       return super.toString() + " \nPix";
    }
}
 