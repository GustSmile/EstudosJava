package Exercicio_05;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        LocalDate dataAtual = LocalDate.now();
        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();
        DateTimeFormatter BR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Pessoa Albert = new Pessoa(14,3,1879, "Albert Einsten");
        Pessoa Isaac = new Pessoa(4,1,1643,"Isaac Newton");

        Albert.setIdade(Albert.calculaIdade(anoAtual));
        Isaac.setIdade(Isaac.calculaIdade(anoAtual));

        Albert.imprimePessoa();
        Isaac.imprimePessoa();

        System.out.println("\nVamos testar com você!");
        System.out.println("Qual o seu nome?");
        String nome = leitor.nextLine();

        Pessoa pessoa = new Pessoa(diaAtual, mesAtual, anoAtual, nome);
    
        System.out.println("Ajuste sua idade");
        pessoa.ajustaDataDeNascimento();

        
        if(pessoa.getAnoNasc()==anoAtual){
            if(pessoa.getMesNasc()==mesAtual){
                if(pessoa.getDiaNasc()==diaAtual) {
                    System.out.println("Feliz Aniversário! Você fez... 0 anos?");
                }else if(pessoa.getDiaNasc()>diaAtual){
                    System.out.println("Mas... Como?");
                }
            }else if(pessoa.getMesNasc()>mesAtual){
                System.out.println("Você... está em outro nível!");
            }
        }else if(pessoa.getAnoNasc()>anoAtual){
            System.out.println("Me avise quando você nascer!");
        }else if(pessoa.getAnoNasc()<=anoAtual-500){
            System.out.println("Tu é velho, muito velho");
        }else if(pessoa.getAnoNasc()!=anoAtual){
            if(pessoa.getMesNasc()==mesAtual){
                if (pessoa.getDiaNasc()==diaAtual) {
                    System.out.println("Feliz Aniversário!");
                }
            }
        }
        pessoa.setIdade(pessoa.calculaIdade(anoAtual));
        pessoa.imprimePessoa();
    }
}
