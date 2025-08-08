package Pessoa_2;

public class Pessoa_2 {
    private String nome;
    private int idade;

    public Pessoa_2(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    }

    public String toString(){
        return String.format("Nome: %s Idade: %d \n", nome, idade);
    }

    public String getPessoa_2(){
        return nome;
    }


}
