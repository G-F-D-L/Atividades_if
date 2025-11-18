package Sistema_Pagamentos;

public class Principal {
	public static void main(String[] args) {
		CadastroPagamento cadastro = new CadastroPagamento(10);

		// Cadastrando alguns pagamentos de exemplo
		cadastro.cadastrarPagamento(new Boleto("Joao", 100.0));
		cadastro.cadastrarPagamento(new CartaoCredito("Maria", 200.0, 3));
		cadastro.cadastrarPagamento(new PIX("Ana", 50.0));

		// Imprime os pagamentos cadastrados
		cadastro.imprimirPagamentos();

		// Calcula e exibe o valor total processado
		double total = cadastro.calcularValorTotal();
		System.out.println("Valor total processado: " + total);
	}
}

