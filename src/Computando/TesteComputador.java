package Computando;

public class TesteComputador {
    public static void main(String[] args) {
        Computador b1 = new Computador();
        b1.marca = "Samsung";
        b1.modelo = "i7-8565U";
        b1.cor = "Preto";
        b1.bateria = 98;
        b1.status();
        b1.desligar();
        b1.codar();
    }
}
