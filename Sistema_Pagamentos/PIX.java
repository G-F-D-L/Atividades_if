package Sistema_Pagamentos;

public class PIX extends Pagamentos{

    private String chavePix;

    public PIX(String nomeCliente, double valor, String chavePix){
        super(nomeCliente, valor);
        this.chavePix = chavePix;
    }
    
    @Override
    public double processarPagamento() {
        return getValor();
    }
    
    @Override
    public String toString() {
       return super.toString() + " \n Pago em Pix" + "\n Chave Pix: " + chavePix;
    }
}
 