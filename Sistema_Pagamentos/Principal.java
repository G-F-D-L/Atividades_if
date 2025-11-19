package Sistema_Pagamentos;

public class Principal {
	public static void main(String[] args) {

		CadastroPagamento cadastro = new CadastroPagamento(3);

		cadastro.cadastrarPagamento(new Boleto("Débora", 1000.0, "123-01923-9359812039"));
		cadastro.cadastrarPagamento(new CartaoCredito("Adrielle", 100.0, 3));
		cadastro.cadastrarPagamento(new PIX("Isadora", 50.0, "Isadora123@gmail.com"));

		cadastro.imprimirPagamentos();

		double total = cadastro.calcularValorTotal();
		System.out.println("Valor total processado: " + total);
	}
}

