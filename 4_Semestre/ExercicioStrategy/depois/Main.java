package depois;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);
        int opcao;


        String nome = "Nome";
        String titulacaoNome = "Nenhuma";
        NenhumaTitulacao nenhuma = new NenhumaTitulacao();
        Especializacao especializacao = new Especializacao();
        Mestrado mestrado = new Mestrado();
        Doutorado doutorado = new Doutorado();
        double salarioBase = 0;
        double salario = 0;

        Professor professor = new Professor(nome, nenhuma, salarioBase, salario);
        
        System.out.println("Qual o nome do professor?");
        nome = leitor.nextLine();
        professor.setNome(nome);

        System.out.println("\nQual o seu Salário Base?");
        salarioBase = leitor.nextDouble();
        professor.setSalarioBase(salarioBase);

        System.out.println("\nQual sua Titulação?"
        +"\n0 - nenhuma"
        +"\n1 - especialização"
        +"\n2 - mestrado"
        +"\n3 - doutorado");
        do{
            opcao = leitor.nextInt();
            switch (opcao) {
                case (1):
                    professor.setTitulacao(especializacao);
                    titulacaoNome = "Especialização";
                    break;
                case (2):
                    professor.setTitulacao(mestrado);
                    titulacaoNome = "Mestrado";
                    break;
                case (3):
                    professor.setTitulacao(doutorado);
                    titulacaoNome = "Doutorado";
                    break;
                case (0):
                    professor.setTitulacao(nenhuma);
                    break;
                default:
                    System.out.println("Digite um valor Válido!");
                    continue;
            }break;
        }while(true);

        salario = professor.getTitulacao().calcula(salarioBase);
        professor.setSalario(salario);


        System.out.println("| Professor Cadastrado |"
        +"\nNome: "+nome
        +"\nTitulação: "+especializacao
        +"\nSalário Base: R$"+salarioBase
        +"\nSalário: R$"+salario);
    }
}
