package ExercicioS_01.Exercicio_01;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do Raio do Círculo: ");
        double raio = Metodo.isDouble();

        Circulo circulo = new Circulo(raio);
        circulo.calculaArea(circulo.getRaio());

        circulo.calculaPerimetro(circulo.getRaio());
    }
}
