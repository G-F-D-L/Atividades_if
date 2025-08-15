package Vetores;

public class Vetores9 {
    public static void main(String[] args) {

        int A[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        double B[] = new double[A.length];

        double C[] = new double [A.length];

        double I = 0.0; // só para ter um valor que define double B[]

        for (int i = 0; i < A.length; i++){
            System.out.println("Vetor A: " + A[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < A.length; i++){
            I = I + 1.0;
            B[i] = I;
            I = I *2;
            
            /*I é adicionado +1 e após definir um valor de B[i], multiplica por 2
            e volta ao início, B[1] seria 3 */

            System.out.println("Vetor B: " + B[i]);
        }

        System.out.println("\n");
         
        for(int i = 0; i < A.length; i++){
            C[i] = A[i] / B[i];
            System.out.printf("Vetor c: %.2f%n ", C[i]);
        }
        // %.2f para formatar e %n para quebra de linha
    }
    
}
