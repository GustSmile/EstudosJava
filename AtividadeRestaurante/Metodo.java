package AtividadeRestaurante;

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
				long valor = Long.parseLong(numString);
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

    public static int isIntegerInt() // METODO PARA CONFERIR NUMEROS INT
	{
        Scanner leitor = new Scanner(System.in);
		do{
			try{
                int valor = leitor.nextInt();
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

    public static double isIntegerDouble() // METODO PARA CONFERIR NUMEROS DOUBLE
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

    public static String FormatarCPF(String CPF) // METODO PARA FORMATAR STRING PARA CPF
    {
        String parte1 = CPF.substring(0,CPF.length() - 8);
        String parte2 = CPF.substring(3,CPF.length() - 5);
        String parte3 = CPF.substring(6,CPF.length() - 2);
        String parte4 = CPF.substring(9,CPF.length());

        return parte1 + "." + parte2 + "." + parte3 + "-" + parte4;
    }

    public static String FormatarTelefone(String telefone){// METODO PARA FORMATAR STRING PARA TELEFONE
        String parte1 = telefone.substring(0,telefone.length() - 9);
        String parte2 = telefone.substring(2,telefone.length() - 8);
        String parte3 = telefone.substring(3,telefone.length() - 4);
        String parte4 = telefone.substring(7,telefone.length());

        return "(" + parte1 + ") " + parte2 + " " + parte3 + "-" + parte4;
    }
}
