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
                return valor;
			} catch (InputMismatchException e){
				System.out.println("Digite um número válido!");
			}
		}while(true);
		
	}
}
