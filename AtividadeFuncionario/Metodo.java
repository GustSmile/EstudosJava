package AtividadeFuncionario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodo {
    
    public static String isStringInteger()//METODO PARA CONFERIR SE STRING É NUMERO
	{
        Scanner leitor = new Scanner(System.in);
		do
		{
			String numString = leitor.nextLine();
			try
            {
				long valor = Long.parseLong(numString);
                if(valor>0){
                    return numString;
                }else{
                    System.out.println("Digite um Número Válido!");
                }
			}
            catch (NumberFormatException e)
            {
				System.out.println("Digite um Número Válido!");
			}
		}while(true);
	}
    
    public static double isDouble() // METODO PARA CONFERIR NUMEROS DOUBLE
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
