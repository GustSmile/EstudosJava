package AtividadePoligono;

public class Quadrado extends Poligono{
    private double lado;

    public Quadrado(String nome, double lado){
        super(nome);
        this.lado = lado;
    }

    //__________LADO
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public void mostrarArea(){
        double area = lado*lado;
        System.out.println("A área do quadrado é "+area+"²");
    }
}
