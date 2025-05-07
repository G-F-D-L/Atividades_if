public class Principalfunc{
    public static void main(String args[]) {
        Funcionario f = new Funcionario(
        1, 
        "João", 
        "123.456.789-00", 
        "Rua A, 123", 
        "(11) 98765-4321", 
        30, 
        5000.00);
        
    // Mostrando os dados do funcionário f
    System.out.println("Dados do Funcionário:");
    System.out.println(f);
    }

    f.setSalario(7800.00);
    System.out.println("\nDados atualizados do funcionário:");
    System.out.println(f);
    System.out.printf("Salário líquido: R$ %.2f\n", f.calculaSalarioLiquido());

}