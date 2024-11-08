package AtividadeContaBancaria;
//import java.util.Scanner;

public class Conta{
	private	String agencia;
	private	String titular;
	private	String tipo;
	private	double saldo;

	//private static Scanner leitor = new Scanner(System.in);

	public Conta() {
		this.agencia = agencia;
		this.titular = titular;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	//			AGENCIA
	public void setAgencia(String ag){
		agencia = ag;
	}
	public void getAgencia(){
		System.out.println("Agência: "+agencia);
	}

	//			TITULAR
	public void setTitular(String tit){
		titular = tit;
	}
	public void getTitular(){
		System.out.println("Titular: "+titular);
	}

	//			TIPO
	public void setTipo(int tip){
		do{
			if (tip == 1) {
				tipo = ("Conta Corrente");
				break;
			}else if(tip == 2){
				tipo = ("Conta Poupança");
				break;
			}
		}while(true);
	}
	public void getTipo(){
		System.out.println("Tipo: "+tipo);
	}

	//			SALDO
	public void setSaldo(double sald){
		this.saldo = sald;
	}
	public void getSaldo(){
		System.out.println("Saldo: "+saldo);
	}

	//			DEPOSITAR
	public void Depositar(double valor){
		saldo+=valor;
	}
	public void Sacar(double valor){
		saldo-=valor;
	}
}
