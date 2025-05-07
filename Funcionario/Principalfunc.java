public class Principalfunc{
    public static void main(String args[]) {
        Funcionario f = new Funcionario(
        1, 
        "Gibiei", 
        "400.289.220-00", 
        "Rua A, 123", 
        "(11) 9235-2345", 
        30, 
        5000.00);
        
    // Mostrando os dados do funcionário f
    System.out.println("Dados do Funcionário:");
    System.out.println(f);
    
    //trocando salário e calculando salário líquido
    f.setSalario(7800.00);
    System.out.println("\nDados atualizados do funcionário:");
    System.out.println(f);
    System.out.printf("Salário líquido: R$ %.2f\n", f.calculaSalarioLiquido());
    }
}

