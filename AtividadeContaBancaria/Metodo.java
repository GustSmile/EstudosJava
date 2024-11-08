package AtividadeContaBancaria;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodo {
    
    public static String isInteger() // METODO PARA CONFERIR STRING PARA NUMEROS
	{
        Scanner leitor = new Scanner(System.in);
		do
		{
			String numString = leitor.nextLine();
			try{
				int valor = Integer.parseInt(numString);
                if(valor>0){
                    return numString;
                }else{
                    System.out.println("Digite um número válido!");
                }
                //String.valueOf(numString);
			} catch (NumberFormatException e){
				System.out.println("Digite um número válido!");
			}
		}while(true);
		
	}

    public static double isIntegerDouble() // METODO PARA CONFERIR NUMEROS DOUBLE
	{
        Scanner leitor = new Scanner(System.in);
		do{
			try{
                double valor = leitor.nextDouble();
				if (valor<0){
					System.out.println("\nNão é possível inserir um valor negativo");
				}else{
					return valor;
				}
			} catch (InputMismatchException e){
				System.out.println("\nDigite um número válido!");
				leitor.next();
			}
		}while(true);
		
	}

    public static int isIntegerInt() // METODO PARA CONFERIR NUMEROS INT
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

    public static String FormatarMetodo(String agencia) // METODO PARA FORMATAR STRING PARA AGENCIA
    {
        String parte1 = agencia.substring(0,agencia.length() - 1);
        String parte2 = agencia.substring(agencia.length() - 1);

        return parte1 + "-" + parte2;
    }
}
