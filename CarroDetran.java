package POO_exercicios_construtores_encapsulamento;

class CarroDetran{
    private String placa;
    private int codigoDetran;

    CarroDetran(String _placa, int _codigoDetran){
        this.placa = _placa;
        this.codigoDetran = _codigoDetran;
    }

    //metodo get placa
    public String getPlaca(){
        return this.placa;
    }

    //metodo set placa
    public void setPlaca(String novaPlaca){
        this.placa = novaPlaca;
    }

    // metodo get
    public int getCodigoDetran(){
        return this.codigoDetran;
    }

    // metodo set
    public void setCodigoDetran(int novoCodigo){
        this.codigoDetran = novoCodigo;
    }

    public boolean permissaoDirigir(int dataAtual, int dataVencimento){
        return (dataAtual < dataVencimento);
    }
}
