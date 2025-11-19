package Sistema_Pagamentos;

public class CadastroPagamento {   
    private Pagamentos[] pagamento;
    private int quantidade;

    public CadastroPagamento(int quantidade) {
        this.pagamento = new Pagamentos[quantidade];
        this.quantidade = 0;
    }

    public void cadastrarPagamento(Pagamentos pagamentos){
        if (pagamento.length > quantidade){
            pagamento[quantidade] = pagamentos;
            quantidade++;
        } else{
            System.out.println("cheio");
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += pagamento[i].processarPagamento();
        }
        return total;
    }

    public void imprimirPagamentos(){
        for (int i = 0; i < quantidade; i++) {
            System.out.println(pagamento[i].toString());
        }
    }
}
