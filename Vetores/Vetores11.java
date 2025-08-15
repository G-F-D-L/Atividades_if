package Vetores;

public class Vetores11 {
    public static void main(String[] args) {
        
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int B = 0;

        for(int i = 0; i < A.length; i++){
            
            if(A[i] % 2 == 0) {
                B++;
            }
        }

        System.out.println("temos " + B + " valores Pares");
    }
}
