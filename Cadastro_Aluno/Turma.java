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
        for(int i = 0; i < alunos.length; i++){
            System.out.println(alunos);
        }
    }

    public String getNomePorMatricula(int num){
        if (this.quantidade == 0 ) return null;

        for(Aluno a: this.alunos){
            if (a.getMatricula() == num)
            return "aluno: " + a;
        }

        return null;
    }
}
