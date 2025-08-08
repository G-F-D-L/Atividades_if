package Vetores;

public class Vetores1 {
    public static void main(String[] args) {
        
        int A[] = {1, 2, 3, 4, 5};

        int B[] = new int[A.length];

        for(int i = 0; i < A.length; i++){
            B[i] = A[i];

            System.out.println("Vetor A: " + A[i]);
        }

        System.out.println("\n");
         
        for(int i = 0; i < A.length; i++){
            System.out.println("Vetor B: " + B[i]);
        }

    }
}
