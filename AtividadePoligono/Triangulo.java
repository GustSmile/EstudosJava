package AtividadePoligono;

public class Triangulo extends Poligono{
    private double lado;
    private double altura;

    public Triangulo(String nome, double lado, double altura){
        super(nome);
        this.lado = lado;
        this.altura = altura;
    }
    
    //__________LADO
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    //__________ALTURA
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarArea(){
        double area = lado*altura;
        area = area/2;
        System.out.println("A área do triângulo é "+area+"²");
    }
}
