package POO_exercicios_construtores_encapsulamento;

public class Turma {
    int qntAlunos;
    String codigoTurma;

    Turma(int _qntAlunos, String _codigoTurma){
        this.qntAlunos = _qntAlunos;
        this.codigoTurma = _codigoTurma;
    }

    //metodo get qntAlunos
    public int getQntAlunos(){
        return this.qntAlunos;
    }

    //metodo set qntAlunos
    public void setQntAlunos(int novaQntAlunos){
        this.qntAlunos = novaQntAlunos;
    }

    //metodo get codigoTurma
    public String getCodigoTurma(){
        return this.codigoTurma;
    }

    // metodo set codigoTurma
    public void setCodigoTurma(String novoCodigoTurma){
        this.codigoTurma = novoCodigoTurma;
    }

    public int MediaAlunoNaTurma(Aluno alunoAnalisado){
        return 0;
    }
}
