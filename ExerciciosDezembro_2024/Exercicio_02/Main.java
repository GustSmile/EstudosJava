package Exercicio_02;

public class Main {
    public static void main(String[] args) {
        double raio;
        int op;

        System.out.println("Qual o raio do Círculo?");
        raio = Metodo.isDoubleNumber();
        Circulo circulo = new Circulo(raio);

        do{
            Menu.mostrarMenu();
            op = Metodo.isNumber();
            switch (op) {
                case(1):
                    circulo.calculaArea();
                    continue;
                case(2):
                    circulo.calculaPerimetro();
                    continue;
                case(3):
                    System.out.println("\nQual o Raio do círculo agora?");
                    raio = Metodo.isDoubleNumber();
                    circulo.setRaio(raio);
                    System.out.println("\nRaio do Círculo atualizado para "+String.format("%.2f", circulo.getRaio()));
                    continue;
                case(0):
                    System.out.println("\nOperação finalizada");
                    break;
                default:
                    System.out.println("\nDigite um valor válido!");
                    break;
            }break;
        }while(true);
    }
}