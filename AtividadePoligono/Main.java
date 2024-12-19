package AtividadePoligono;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu.mostrarMenu();
        int op;
        double valor1, valor2;
        
        do{
            op = Metodo.isNumber();
            switch (op) {
                case (1):
                    System.out.println("________"+"\nQUADRADO"+"\n________");
                    System.out.println("Qual o tamanho do lado deste Quadrado?");
                    valor1 = Metodo.isDoubleNumber();
                    Quadrado quadrado = new Quadrado("Quadrado", valor1);
                    quadrado.mostrarArea();
                    break;
                case (2):
                    System.out.println("________"+"\nCIRCULO"+"\n________");
                    System.out.println("\nQual o tamanho do raio deste Circulo?");
                    valor1 = Metodo.isDoubleNumber();
                    Circulo circulo = new Circulo("Circulo", valor1);
                    circulo.mostrarArea();
                    break;
                case (3):
                    System.out.println("________"+"\nRETANGULO"+"\n________");
                    System.out.println("\nQual o tamanho da base deste Retangulo?");
                    valor1 = Metodo.isDoubleNumber();
                    System.out.println("\nQual o tamanho da altura deste Retangulo?");
                    valor2 = Metodo.isDoubleNumber();
                    Retangulo retangulo = new Retangulo("Retangulo", valor1, valor2);
                    retangulo.mostrarArea();
                    break;
                case (4):
                    System.out.println("________"+"\nTRIANGULO"+"\n________");
                    System.out.println("\nQual o tamanho da base deste Triangulo?");
                    valor1 = Metodo.isDoubleNumber();
                    System.out.println("\nQual o tamanho da altura deste Triangulo?");
                    valor2 = Metodo.isDoubleNumber();
                    Triangulo triangulo = new Triangulo("Triangulo", valor1, valor2);
                    triangulo.mostrarArea();
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    continue;
            }
            break;
        }while(true);
    }
}
