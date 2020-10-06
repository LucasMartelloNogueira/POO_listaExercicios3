package POO_exercicios_construtores_encapsulamento;

public class CarroRevendedora{
    private String placa;
    private int precoRevenda;

    CarroRevendedora(String _placa, int _precoRevenda){
        this.placa = _placa;
        this.precoRevenda = _precoRevenda;
    }

    //metodo get placa
    public String getPlaca(){
        return this.placa;
    }

    //metodo set placa
    public void setPlaca(String novaPlaca){
        this.placa = novaPlaca;
    }

    // metodo get preco revenda
    public int getPrecoRevenda(){
        return this.precoRevenda;
    }

    // metodo set preco revenda
    public void setPrecoRevenda(int novoPreco){
        this.precoRevenda = novoPreco;
    }

    public int addPrecoSeguro(){
        return this.precoRevenda + 10000;
    }
    
}
