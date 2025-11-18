package Sistema_Pagamentos;

public class CartaoCredito extends Pagamentos{
    
    private double parcelas;

    public CartaoCredito(String nomeCliente, double valor, double parcelas){
        super(nomeCliente, valor);
        this.parcelas = parcelas;
    }

    public double processarPagamento(){
        return getValor() + (getValor() * (parcelas * 0.02));
    }

        public String toString() {
       return super.toString() + " Parcelas: " + parcelas + " \nCartao de Credito";
    }
    
}
