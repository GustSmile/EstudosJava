package AtividadeRestaurante;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String cpf,endereco,nome,telefone,email,observacoes,codigo;
        double preco;
        int op, mesa;
        
        //------------------------------CADASTRO DO CLIENTE
            System.out.println("CPF do Cliente(somente os Números):");
            do{
                cpf = Metodo.isInteger();
                if(cpf.length()!=11){
                    System.out.println("O CPF precisa ter 11 dígitos(somente os Números)");
                }else{
                    cpf = Metodo.FormatarCPF(cpf);
                    break;
                }
            }while(true);

            System.out.println("Endereço do Cliente:");
            endereco = leitor.nextLine();

            System.out.println("Nome do Cliente:");
            nome = leitor.nextLine();

            System.out.println("Telefone do Cliente(somente os Números):");
            do{
                telefone = Metodo.isInteger();
                if(telefone.length()!=11){
                    System.out.println("O Telefone precisa ter 11 dígitos(somente os Números)");
                }else{
                    telefone = Metodo.FormatarTelefone(telefone);
                    break;
                }
            }while(true);

            System.out.println("E-mail do Cliente:");
            email = leitor.nextLine();

            System.out.println("Observações:");
            observacoes = leitor.nextLine();

            Cliente cliente =  new Cliente(cpf,endereco,nome,telefone,email,observacoes);

            cliente.ImprimirDados();



        //------------------------------CADASTRO GARCOM
            System.out.println("CPF do Garcom(somente os Números):");
            do{
                cpf = Metodo.isInteger();
                if(cpf.length()!=11){
                    System.out.println("O CPF precisa ter 11 dígitos(somente os Números)");
                }else{
                    cpf = Metodo.FormatarCPF(cpf);
                    break;
                }
            }while(true);

            System.out.println("Nome do Garcom:");
            nome = leitor.nextLine();

            System.out.println("Telefone do Garcom(somente os Números):");
            do{
                telefone = Metodo.isInteger();
                if(telefone.length()!=11){
                    System.out.println("O Telefone precisa ter 11 dígitos(somente os Números)");
                }else{
                    telefone = Metodo.FormatarTelefone(telefone);
                    break;
                }
            }while(true);

            System.out.println("Código do Garcom:");
            codigo = leitor.nextLine();

            Garcom garcom = new Garcom(nome, cpf, telefone, codigo);

            garcom.ImprimirDados();



        //------------------------------CADASTRO PRODUTO
            System.out.println("Nome do Produto:");
            nome = leitor.nextLine();

            System.out.println("Preco do Produto:");
            preco = Metodo.isIntegerDouble();

            System.out.println("Codigo do Produto:");
            codigo = leitor.nextLine();

            Produto produto = new Produto(nome, preco, codigo);

            produto.ImprimirDados();

        //------------------------------CADASTRO PEDIDO
            System.out.println("Mesa do Pedido:");

            mesa = Metodo.isIntegerInt();

            Pedido pedido = new Pedido(cliente, garcom, produto,mesa);

            pedido.ImprimirDados();


        /*  IDEIA ABANDONADA
        do{
            System.out.println("Qual operação deseja realizar?\n1-Cadastrar Cliente\n2-Cadastrar Garcom\n3-Cadastrar Produto\n4-Mostrar Cliente\n5-Mostrar Garcom\n6-Mostrar Produto");
            op = Metodo.isIntegerInt();
            if(op == 1 ){
                System.out.println("CADASTRO DE CLIENTE");
            }
        }while(true);
         */

    }
}
