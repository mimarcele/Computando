package Computando;

public class Computador {
    String marca;
    String modelo;
    String cor;
    int bateria;
    float tamanho;
    boolean ligado;
    void status (){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Bateria: " + this.bateria);

    }

    void codar() {
        if(this.ligado == true) {
            System.out.println("Vamos criar um projeto Java?");
        } else {
            System.out.println("Ligue o computador");
        }

    }

    void ligar () {
        this.ligado = false;

    }

    void desligar () {
        this.ligado = true;

    }
}

