package POO_exercicios_construtores_encapsulamento;

public class Carro {
    private String placa;

    Carro(String _placa){
        this.placa = _placa;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String novaPlaca){
        this.placa = novaPlaca;
    }

    public static void buzinar(){
        System.out.println("Bi Biiiii!\n");
    }

}
