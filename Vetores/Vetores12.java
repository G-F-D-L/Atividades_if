package Vetores;

public class Vetores12 {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int B = 0;
        
        for (int i = 0; i < A.length; i++) {
            B += A[i];
            // += para somar o A[i] e atribuir o valor da soma para B
        }
        
        System.out.println("A soma de todos os elementos do vetor é: " + B);
    }
    
}
