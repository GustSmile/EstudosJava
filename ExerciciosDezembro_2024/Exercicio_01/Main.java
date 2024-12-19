package Exercicio_01;

public class Main {
    public static void main(String[] args) {
        Menu.mostrarMenu();
        int op;

        do{
            Menu.mostrarMenu();
            op = Metodo.isNumber();
            switch(op){
                case(1):
                    Contador.zerar();
                    System.out.println("\n___________________________"+"\nContador Zerado");
                    continue;
                case(2):
                    Contador.incrementar();
                    System.out.println("\n___________________________"+"\nValor Incrementado");
                    continue;
                case(3):
                    System.out.println("\n___________________________"+"\nContador está em "+ Contador.returnContador());
                    continue;
                case(0):
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    continue;
            }break;
        }while(true);
    }
}
