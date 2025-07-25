package pessoa;

//class
public class Pessoa{
    //atributos
    private String nome;
    private int idade;

    //construtor    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //método
    public void falar(){
    System.out.println("Olá mundo");
    }
     //tostring
    public String toString(){
        return ("Nome: " + nome + ", Idade: " + idade);
    }
}
