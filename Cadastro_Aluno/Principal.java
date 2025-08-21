package Cadastro_Aluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Turma t = new Turma(1);
        String nome;
        int matricula;
        double nota1, nota2;
        
        for(int i = 0; i < 1; i++){
            System.out.println("Digite o nome: ");
            nome = teclado.nextLine();

            System.out.println("Digite a matrícula: ");
            matricula = teclado.nextInt(); teclado.nextLine();

            System.out.println("Digite a primeira nota: ");
            nota1 = teclado.nextDouble(); teclado.nextLine();

            System.out.println("Digite a segunda nota: ");
            nota2 = teclado.nextDouble(); teclado.nextLine();

            t.adicionar(new Aluno(nome, matricula, nota1, nota2));
        }

        t.listarAlunos();

        System.out.println("Digite a matrícula do aluno que deseja procurar: ");
        matricula = teclado.nextInt();
        t.getNomePorMatricula(matricula);
        


    }
}
