package depois;

public class Especializacao implements Titulacao{
    public double calcula(double salarioBase){
        return salarioBase+=salarioBase*0.2;
    }
}
