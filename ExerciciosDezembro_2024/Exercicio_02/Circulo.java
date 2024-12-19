package Exercicio_02;

public class Circulo {
    private double raio;
    private double pi = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }
    

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void calculaArea(){
        double valor = pi*raio*raio;
        System.out.println("A área do Círculo é "+String.format("%.2f", valor)+"²");
    }

    public void calculaPerimetro(){
        double valor = pi*2*raio;
        System.out.println("O perimetro do Círculo é "+String.format("%.2f", valor)+"²");
    }
}
