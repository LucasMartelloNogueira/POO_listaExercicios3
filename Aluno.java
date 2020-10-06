package POO_exercicios_construtores_encapsulamento;

public class Aluno {
    private String nome;
    private float cr;

    Aluno(String _nome, float _cr){
        this.nome = _nome;
        this.cr = _cr;
    }

    // metodo get nome
    public String getNome(){
        return this.nome;
    }

    // metodo set nome
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    //metodo get cr
    public float getCr(){
        return this.cr;
    }

    //metodo set cr
    public void setCr(float novoCr){
        this.cr = novoCr;
    }

    public void exibirHistorico(){

    }

    public void calcularCr(){
        
    }
}
