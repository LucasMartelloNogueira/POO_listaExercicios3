package POO_exercicios_construtores_encapsulamento;

public class Inscricao {
    private int qntVagas;
    private int qntPedidos;

    Inscricao(int _qntVagas, int _qntPedidos){
        this.qntVagas = _qntVagas;
        this.qntPedidos = _qntPedidos;
    }

    //metodo get qntVagas
    public int getQntVagas(){
        return this.qntVagas;
    }

    //metodo set qntVagas
    public void setQntVagas(int novaQntVagas){
        this.qntVagas = novaQntVagas;
    }

    //metodo get qntPedidos
    public int getQntPedidos(){
        return this.qntPedidos;
    }

    //metodo set qntPedidos
    public void setQntPedidos(int novaQntPedidos){
        this.qntPedidos = novaQntPedidos;
    }

    public void descricaoEmenta(){
        
    }

    public void ObterHorarioAula(){
        
    }
    
}
