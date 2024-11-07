package AtividadeCarro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodo {
    public static double isInteger() // METODO PARA CONFERIR NUMEROS
	{
        Scanner leitor = new Scanner(System.in);
		do{
			try{
                double valor = leitor.nextDouble();
				if (valor<0){
					System.out.println("\nNão é possível inserir um valor negativo\n");
				}else{
					return valor;
				}
			} catch (InputMismatchException e){
				System.out.println("\nDigite um número válido!\n");
				leitor.next();
			}
		}while(true);
		
	}
	public static int isIntegerInt() // METODO PARA CONFERIR NUMEROS
	{
        Scanner leitor = new Scanner(System.in);
		do{
			try{
                int valor = leitor.nextInt();
                if (valor<0){
					System.out.println("Não é possível inserir um valor negativo");
				}else{
					return valor;
				}
			} catch (InputMismatchException e){
				System.out.println("Digite um número válido!\n");
				leitor.next();
			}
		}while(true);
		
	}
}

