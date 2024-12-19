package AtividadePoligono;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodo {
    

    // METODO PARA CONFERIR NUMEROS INT
        public static int isNumber()
        {
            Scanner leitor = new Scanner(System.in);
            do{
                try
                {
                    int valor = leitor.nextInt();
                    if (valor<0){
                        System.out.println("Digite um valor válido!");
                    }else{
                        return valor;
                    }
                } catch (InputMismatchException e)
                {
                    System.out.println("Digite um valor válido!");
                    leitor.next();
                }
            }while(true);
        }
        
    // METODO PARA CONFERIR NUMEROS DOUBLE
        public static double isDoubleNumber()
        {
            Scanner leitor = new Scanner(System.in);
            do{
                try{
                    double valor = leitor.nextDouble();
                    if (valor<0){
                        System.out.println("Digite um número válido!");
                    }else{
                        return valor;
                    }
                } catch (InputMismatchException e){
                    System.out.println("Digite um número válido!");
                    leitor.next();
                }
            }while(true);
            
        }

    
    }
