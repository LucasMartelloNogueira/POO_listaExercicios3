package POO_exercicios_construtores_encapsulamento;

public class Principal {
    public static void main(String[] args){
        Data data1 = new Data(5, 9, 1998);
        Data data2 = new Data("Maio", 21, 1964);

        data1.printDataV1();
        data1.printDataV2();
        data1.printDataV3();

        System.out.println("-----------------------");

        data2.printDataV1();
        data2.printDataV2();
        data2.printDataV3();
    }
}
