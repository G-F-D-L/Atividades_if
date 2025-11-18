package Sistema_Pagamentos;

public class Boleto extends Pagamentos{
    
    public Boleto(String nomeCliente, double valor){
        super(nomeCliente, valor);
    }

    public double processarPagamento(){
        return getValor() + (getValor() * 0.015); //taxa de 1,5%
    }
    
        public String toString() {
       return super.toString() + " \nBoleto";
    }
}
