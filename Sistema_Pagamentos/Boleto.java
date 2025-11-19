package Sistema_Pagamentos;

public class Boleto extends Pagamentos{

    private String linhaDigitavel;
    
    public Boleto(String nomeCliente, double valor, String linhaDigitavel){
        super(nomeCliente, valor);
        this.linhaDigitavel = linhaDigitavel;
    }

    public double processarPagamento(){
        return getValor() + (getValor() * 0.015); //taxa de 1,5%
    }
    
        public String toString() {
       return super.toString() + " \n Pago em Boleto, nº: " + linhaDigitavel + "\n Valor total a pagar: " + processarPagamento();
    }
}
