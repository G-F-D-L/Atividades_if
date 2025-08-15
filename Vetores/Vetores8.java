package Vetores;

public class Vetores8 {
    public static void main(String[] args) {
        
         int A[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int B[] = new int[A.length];

        int C[] = new int [A.length];

        for (int i = 0; i < A.length; i++){
            System.out.println("Vetor A: " + A[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < A.length; i++){
            B[i] = A[i] * 2;
            System.out.println("Vetor B: " + B[i]);
        }

        System.out.println("\n");
         
        for(int i = 0; i < A.length; i++){
            C[i] = A[i] * B[i];
            System.out.println("Vetor c: " + C[i]);
        }

    }
    
}
