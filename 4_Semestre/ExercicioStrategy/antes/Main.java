package antes;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String nome, titulacao;
        double salario;
        int opcao;

        System.out.println("Qual o nome do Professor?");
        nome = leitor.nextLine();

        System.out.println("\nQual sua Titulação?"
        +"\n0 - nenhuma"
        +"\n1 - especialização"
        +"\n2 - mestrado"
        +"\n3 - doutorado");
        do{
            opcao = leitor.nextInt();
            switch (opcao) {
                case (0):
                    titulacao = "nenhuma";
                    break;
                case (1):
                    titulacao = "especializacao";
                    break;
                case (2):
                    titulacao = "mestrado";
                    break;
                case (3):
                    titulacao = "doutorado";
                    break;
                default:
                    System.out.println("Digite um valor Válido!");
                    continue;
            }break;
        }while(true);

        System.out.println("\nQual o seu Salário?");
        salario = leitor.nextDouble();

        if(titulacao.equals("especializacao")){
            salario+=salario*0.2;
        }
        else if(titulacao.equals("mestrado")){
            salario+=salario*0.3;
        }
        else if(titulacao.equals("doutorado")){
            salario+=salario*0.5;
        }
        
        Professor professor = new Professor(nome, salario, titulacao);

        System.out.println("| Professor Cadastrado |"
        +"\n Nome: "+professor.getNome()
        +"\n Titulação: "+professor.getTitulacao()
        +"\n Salário: R$"+professor.getSalario());
    }
}
