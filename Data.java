package POO_exercicios_construtores_encapsulamento;

public class Data {
    int dia;
    String mes;
    int ano;
    String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril",
                      "Maio", "Junho", "Julho", "Agosto", 
                      "Setembro", "Outubro", "Novembro", "Dezembro"};

    Data(int _dia, int _mes, int _ano){
        this.dia = _dia;
        this.mes = meses[_mes - 1];
        this.ano = _ano;
    }

    Data(String _mes, int _dia, int _ano){
        this.mes = _mes;
        this.dia = _dia;
        this.ano = _ano;
    }

    Data(int _diasNoAno, int _ano){
        int _mes = (int) _diasNoAno / 30;
        int _dia = (int) (_diasNoAno / 30) % 30;
        
        this.mes = meses[_mes];
        this.dia = _dia;
        this.ano = _ano;
    }

    public int numMes(String nomeMes){
        int n = 1;
        for (String mes: meses){
            if (mes == nomeMes){
                break;
            }
            else{
                n++;
            }
        }
        return n;
    }

    public int numDiasAno(String nomeMes, int _dia){
        int numMes = numMes(nomeMes);
        int diasAno = numMes * 30 + _dia;
        return diasAno;
    }

    public void printDataV1(){
        int numMes = numMes(this.mes);
        System.out.printf("%02d/%02d/%d\n", this.dia, numMes, this.ano);
    }

    public void printDataV2(){
        System.out.printf("%s %02d %d\n", this.mes, this.dia, this.ano);
    }

    public void printDataV3(){
        int diasAno = numDiasAno(this.mes, this.dia);
        System.out.printf("%03d %d\n", diasAno, this.ano);
    }
}
