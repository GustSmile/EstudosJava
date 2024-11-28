import java.util.Scanner;

public class Metodo {

    public static String isInteger() // METODO PARA CONFERIR STRING PARA NUMEROS
	{
        Scanner leitor = new Scanner(System.in);
		do
		{
			String CPF = leitor.nextLine();
            if(CPF.length()!=14){
                System.out.println("O CPF precisa ter 11(onze) dígitos!");
            }else{
                String numJunto = JuntaNumeros(CPF);
                try{
                    long valor = Long.parseLong(numJunto);
                    if(valor>0){
                        return CPF;
                    }else{
                        System.out.println("Digite um número válido!");
                    }
                    //String.valueOf(numString);
                } catch (NumberFormatException e){
                    System.out.println("Digite um número válido!");
                }
            }
		}while(true);
	}

    /*---------------------------NÃO USEI!!!-------------------------------------------
    public static String isIntegerTeste(String parte) // METODO PARA CONFERIR STRING PARA NUMEROS
	{
			try{
				long valor = Long.parseLong(parte);
                return parte;
                //String.valueOf(numString);
			} catch (NumberFormatException e){
				String mensagem = "Digite o CPF corretamente!";
                return mensagem;
			}
	}
     */

    public static String JuntaNumeros(String CPF){
        String parte1 = CPF.substring(0,CPF.length() - 11);
        String parte2 = CPF.substring(4,CPF.length() - 7);
        String parte3 = CPF.substring(8,CPF.length() - 3);
        String parte4 = CPF.substring(12,CPF.length());

        return parte1+parte2+parte3+parte4;
    }

    public static String FormatarCPF(String CPF) // METODO PARA FORMATAR STRING PARA CPF
    {
        
        String ponto1 = CPF.substring(3,CPF.length() - 10 );
        
        String ponto2 = CPF.substring(7,CPF.length() - 6);
        
        String hifen = CPF.substring(11,CPF.length() - 2);

        

        //String parte4 = CPF.substring(9,CPF.length());
        if (ponto1.equals(".") && ponto2.equals(".") && hifen.equals("-")){
            return CPF;
        }else{
            String mensagem = "Digite o CPF corretamente!";
            return mensagem;
        }
        

    }
}
