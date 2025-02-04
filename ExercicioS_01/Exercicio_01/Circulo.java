package ExercicioS_01.Exercicio_01;

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

    public void calculaArea(double raio){
        double area = (raio*pi)/2;
        String areaString = String.format("%.2f", area);
        System.out.println("A área deste Círculo é: "+areaString+"²");
    }
    public void calculaPerimetro(double raio){
        double perimetro = (pi*2)*raio;
        String perimetroString = String.format("%.2f", perimetro);
        System.out.println("A perimetro deste Círculo é: "+perimetroString);
    }

}
