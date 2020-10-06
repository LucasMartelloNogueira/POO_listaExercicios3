package POO_exercicios_construtores_encapsulamento;

public class Professor {
    private String nome;
    private String materia;

    Professor(String _nome, String _materia){
        this.nome = _nome;
        this.materia = _materia;
    }

    // metodo get nome
    public String getNome(){
        return this.nome;
    }

    //metodo set nome
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    //metodo get materia
    public String materia(){
        return this.materia;
    }

    //metodo set materia
    public void setMateria(String novaMateria){
        this.materia = novaMateria;
    }

    public void ObterHorarioAula(){
        
    }
}
