package POO_exercicios_construtores_encapsulamento;

public class CarroLocadora{
    private String placa;
    private int precoAluguel;

    CarroLocadora(String _placa, int _precoAluguel){
        this.placa = _placa;
        this.precoAluguel = _precoAluguel;
    }

    //metodo get placa
    public String getPlaca(){
        return this.placa;
    }

    //metodo set placa
    public void setPlaca(String novaPlaca){
        this.placa = novaPlaca;
    }

    // metodo get preco aluguel
    public int getPrecoAluguel(){
        return this.precoAluguel;
    }

    // metodo set preco aluguel
    public void setPrecoAluguel(int novoPrecoAluguel){
        this.precoAluguel = novoPrecoAluguel;
    }

    public int gerarProtocoloAluguel(){ return 0;}
}
