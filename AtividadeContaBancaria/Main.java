package AtividadeContaBancaria;
import java.util.Scanner;
//import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Auto-generated method stub
		//Random sorteio = new Random ();
		//String numero = String.valueOf(sorteio.nextInt(1000000, 9999999));
		
		Conta conta = new Conta();

		Scanner leitor = new Scanner(System.in);

		String agencia,titular;
		int tipo, op;
		double saldo, valor;

	//AGENCIA--AGENCIA--AGENCIA---AGENCIA--AGENCIA
			System.out.println("Digite o número de sua Agência:");
			do{
				agencia = Metodo.isInteger();
				if (agencia.length()!=5) {
					System.out.println("Insira um valor com 5 Dígitos");
				}else{
					agencia = Metodo.FormatarMetodo(agencia);
					conta.setAgencia(agencia);
					break;
				}
			}while(true);
			conta.getAgencia();
			System.out.println();

	//TITULAR--TITULAR--TITULAR--TITULAR--TITULAR
			System.out.println("Digite o Nome do Titular:");
			titular = leitor.nextLine();
			conta.setTitular(titular);
			System.out.println();

	//TIPO--TIPO--TIPO--TIPO--TIPO
			System.out.println("Digite o Tipo de sua Conta:\n1-Conta Corrente\n2-Conta poupança");
			do{
				tipo = Metodo.isIntegerInt();
				if (tipo>0 && tipo<3) {
					conta.setTipo(tipo);
					break;
				}else{
					System.out.println("Valor Inválido");
				}
			}while(true);
			conta.getTipo();
			System.out.println();

	//SALDO--SALDO--SALDO--SALDO--SALDO
			System.out.println("Quanto será seu Saldo inicial?");
			saldo = Metodo.isIntegerDouble();
			conta.setSaldo(saldo);
			conta.getSaldo();
			System.out.println();

		System.out.println("Seus dados:");
		conta.getAgencia();
		conta.getTitular();
		conta.getTipo();
		conta.getSaldo();
		System.out.println();
		
		
		do{
			System.out.println("Deseja realizar qual Operação:\n1-Depositar\n2-Sacar\n3-Conferir Saldo\n0-Encerrar");
			op = Metodo.isIntegerInt();
			if(op==1){
				System.out.println("Quanto deseja Depositar?");
				valor = Metodo.isIntegerDouble();
				conta.Depositar(valor);
			}else if(op==2){
				System.out.println("Quanto deseja Sacar?");
				do{
					valor = Metodo.isIntegerDouble();
					if(valor>saldo){
						System.out.println("Saldo Insuficiente");
					}else{
						conta.Sacar(valor);
						break;
					}
				}while(true);
			}else if(op==3){
				conta.getSaldo();
			}else if(op==0){
				System.out.println("Operação Encerrada");
				break;
			}else{
				System.out.println("Valor não correspodente à nenhuma Operação");
			}
		}while(true);

	}
}