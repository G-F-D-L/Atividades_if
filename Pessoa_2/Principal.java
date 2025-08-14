package Pessoa_2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa_2[] numeros = new Pessoa_2[5];

        for (int i = 0; i < 3; i++){
            System.out.println("Digite o nome da pessoa: ");
            String nome = teclado.nextLine();
            System.out.println("Digite a idade da pessoa: ");
            int idade = teclado.nextInt();
            teclado.nextLine();

            Pessoa_2 p = new Pessoa_2(nome, idade);
            System.out.println(p);
        }
        teclado.close();

    }
}
