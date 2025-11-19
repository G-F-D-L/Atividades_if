package Sistema_Pagamentos;

public class CartaoCredito extends Pagamentos{
    
    private double quantidadeParcelas;

    public CartaoCredito(String nomeCliente, double valor, double quantidadeParcelas){
        super(nomeCliente, valor);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double processarPagamento(){
        return getValor() + (getValor() * (quantidadeParcelas * 0.02));
    }

        public String toString() {
       return super.toString() + " Parcelas: " + quantidadeParcelas + " \n Cartao de Credito, total a pagar: " + processarPagamento();
    }
    
}
