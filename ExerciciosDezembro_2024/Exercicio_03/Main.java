package Exercicio_03;

public class Main {
    public static void main(String[] args) {
        int lado;
        Triangulo triangulo = new Triangulo();

        System.out.println("Insira o tamanho dos 3 lados do Triângulo: ");
        
        System.out.println("Lado 1:");
        lado = Metodo.isNumber();
        triangulo.inserirLado(lado);
        
        System.out.println("Lado 2:");
        lado = Metodo.isNumber();
        triangulo.inserirLado(lado);
        
        System.out.println("Lado 3:");
        lado = Metodo.isNumber();
        triangulo.inserirLado(lado);

        System.out.println();
        triangulo.tipoTriangulo();
    }
}
