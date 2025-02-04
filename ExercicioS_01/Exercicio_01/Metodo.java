package ExercicioS_01.Exercicio_01;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Metodo {
    public static double isDouble(){
        Scanner leitor = new Scanner(System.in);
        do{
            try{
                double valor = leitor.nextDouble();
                if(valor <= 0){
                    System.out.println("\nDigite um valor maior que zero!");
                }else{
                    return valor;
                }
            }catch(InputMismatchException erro){
                System.out.println("\nDigite um valor válido!");
                leitor.next();
            }
        }while(true);
    }
}

