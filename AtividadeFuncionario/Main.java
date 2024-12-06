package AtividadeFuncionario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        String nome, endereco, cpf, telefone, codigo, matricula, turno;
        double salario, adicionalNoturno;

        //CADASTRAR ASSISTENTE
            //NOME
            System.out.println("Qual o nome do Assistente?");
            nome = leitor.nextLine();

            //ENDERECO
            System.out.println("\nQual o endereço do Assistente?");
            endereco = leitor.nextLine();

            //CPF
            System.out.println("\nQual o cpf do Assistente?");
            do{
                cpf = Metodo.isStringInteger();
                if(cpf.length()!=11){
                    System.out.println("CPF precisa ter 11 dígitos");
                }else{
                    cpf = Metodo.FormatarCPF(cpf);
                    break;
                }
            }while(true);

            //TELEFONE
            System.out.println("\nQual o telefone do Assistente?");
            do{
                telefone = Metodo.isStringInteger();
                if(telefone.length()!=11){
                    System.out.println("Telefone precisa ter 11 dígitos");
                }else{
                    telefone = Metodo.FormatarTelefone(telefone);
                    break;
                }
            }while(true);

            //CODIGO
            System.out.println("\nQual o código do Assistente?");
            codigo = Metodo.isStringInteger();

            //SALARIO
            System.out.println("\nQual o salário do Assistente?");
            salario = Metodo.isDouble();

            //MATRICULA
            System.out.println("\nQual a matrícula do Assistente?");
            matricula = Metodo.isStringInteger();

        Assistente assistente = new Assistente(nome, endereco, cpf, telefone, codigo, salario, matricula);
        assistente.imprimirDados();



        //CADASTRAR TECNICO
            //NOME
            System.out.println("Qual o nome do Tecnico?");
            nome = leitor.nextLine();

            //ENDERECO
            System.out.println("\nQual o endereço do Tecnico?");
            endereco = leitor.nextLine();

            //CPF
            System.out.println("\nQual o cpf do Tecnico?");
            do{
                cpf = Metodo.isStringInteger();
                if(cpf.length()!=11){
                    System.out.println("CPF precisa ter 11 dígitos");
                }else{
                    cpf = Metodo.FormatarCPF(cpf);
                    break;
                }
            }while(true);

            //TELEFONE
            System.out.println("\nQual o telefone do Tecnico?");
            do{
                telefone = Metodo.isStringInteger();
                if(telefone.length()!=11){
                    System.out.println("Telefone precisa ter 11 dígitos");
                }else{
                    telefone = Metodo.FormatarTelefone(telefone);
                    break;
                }
            }while(true);

            //CODIGO
            System.out.println("\nQual o código do Tecnico?");
            codigo = Metodo.isStringInteger();

            //SALARIO
            System.out.println("\nQual o salário do Tecnico?");
            salario = Metodo.isDouble();

            //TURNO
            System.out.println("\nEm qual turno trabalha o Tecnico? (Matutino/Vespertino/Noturno)");
            do{
                turno = leitor.nextLine();
                if(turno.equals("Matutino") || turno.equals("matutino")){
                    break;
                }
                else if(turno.equals("Vespertino") || turno.equals("vespertino")){
                    break;
                }
                else if(turno.equals("Noturno") || turno.equals("noturno")){
                    break;
                }
                else{
                    System.out.println("Resposta não corresponde à nenhuma das Alternativas");
                }
            }while(true);

            //ADICIONAL NOTURNO
            adicionalNoturno = 0;
            if(turno.equals("Noturno") || turno.equals("noturno")){
                System.out.println("\nQuanto será o Adicional Noturno?");
                adicionalNoturno = Metodo.isDouble();
            }

            Tecnico tecnico = new Tecnico(nome, endereco, cpf, telefone, codigo, salario, turno, adicionalNoturno);

            tecnico.imprimirDados();

    }
}
