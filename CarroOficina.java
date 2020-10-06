package POO_exercicios_construtores_encapsulamento;

public class CarroOficina{
    private String placa;
    private int precoReparo;

    CarroOficina(String _placa, int _precoReparo){
        this.placa = _placa;
        this.precoReparo = _precoReparo;
    }

    //metodo get placa
    public String getPlaca(){
        return this.placa;
    }

    //metodo set placa
    public void setPlaca(String novaPlaca){
        this.placa = novaPlaca;
    }

    // metodo get preco reparo
    public int getPrecoReparo(){
        return this.precoReparo;
    }

    // metodo set preco reparo
    public void setPrecoReparo(int novoPrecoReparo){
        this.precoReparo = novoPrecoReparo;
    }

    public String gerarNotaFiscal(){return "comprovante de pagamento";}
}