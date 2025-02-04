package Exercicio_03;
import java.util.*;

public class Metodo {
    
    public static int isInteger(){
        Scanner leitor = new Scanner(System.in);
        do{
            try{
                int valor = leitor.nextInt();
                if(valor<=0){
                    System.out.println("Valor inválido!");
                }else{
                    return valor;
                }
            }
            catch(InputMismatchException erro){
                System.out.println("\nValor inválido!");
                leitor.next();
            }
        }while(true);
    }
}
