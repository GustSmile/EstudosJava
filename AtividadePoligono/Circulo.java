package AtividadePoligono;

public class Circulo extends Poligono{
    private double raio;
    private double pi = 3.14;

    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    //__________RAIO
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void mostrarArea(){
        double area = raio*raio;
        area = area*pi;
        System.out.println("A área do círculo é "+area+"²");
    }
}
