package POO_exercicios_construtores_encapsulamento;

public class Disciplina {
    private String nome;
    private String ementa;

    Disciplina(String _nome, String _ementa){
        this.nome = _nome;
        this.ementa = _ementa;
    }

    // metodo get nome
    public String getNome(){
        return this.nome;
    }

    //metodo set nome
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    //metodo get ementa
    public String getEmenta(){
        return this.ementa;
    }

    // metodo set ementa
    public void setEmenta(String novaEmenta){
        this.ementa = novaEmenta;
    }

    public void descricaoEmenta(){
        
    }
}
