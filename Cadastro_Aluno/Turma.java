package Cadastro_Aluno;

public class Turma {
    private Aluno[] alunos;
    private int quantidade;

    public Turma(int quantidade){
        this.quantidade = 0;
        this.alunos = new Aluno[quantidade];
    }

    public boolean adicionar(Aluno a){
        if (quantidade == this.alunos.length) return false;
        this.alunos[this.quantidade++] = a;
        return true;
    }

    public void listarAlunos(){
        for(Aluno a : alunos){
            a.exibirInfo();
        }
    }

    public Aluno getNomePorMatricula(int matricula){
        if (this.quantidade == 0 ) return null;
        
        for(Aluno a: this.alunos){

            if (a.getMatricula() == matricula){
                 a.exibirInfo();
            }

            else{
                System.out.println("Aluno não encontrado!");
            }
        }
        return null;
    }
}
