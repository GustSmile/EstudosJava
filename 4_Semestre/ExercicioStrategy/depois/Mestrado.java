package depois;

public class Mestrado implements Titulacao{
    public double calcula(double salarioBase){
        return salarioBase+=salarioBase*0.3;
    }
}
