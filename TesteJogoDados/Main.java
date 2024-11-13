package TesteJogoDados;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Auto-generated method stub
		Random sorteio = new Random ();
        Scanner leitor = new Scanner(System.in);

        Jogador jogador1 =  new Jogador();
        Jogador jogador2 =  new Jogador();

        String nome;
        System.out.println("Insira seu nome Jogador nº1:");
        nome = leitor.nextLine();
        jogador1.setNome(nome);
        
        do{
            System.out.println("Insira seu nome Jogador nº2:");
            nome = leitor.nextLine();
            jogador2.setNome(nome);
            if(jogador1.getNome().equals(jogador2.getNome())){
                System.out.println("O nome dos Jogadores tem que ser diferente!");
            }else{
                jogador2.setNome(nome);
                break;
            }
        }while(true);

        System.out.println();

        int dado, pontos1=0, pontos2=0;
        for(int i = 0; i<3; i++){
            System.out.println("Rodada nº"+(i+1));
            dado = sorteio.nextInt(1, 7);;
            jogador1.setDado(dado);
            System.out.println("Jogador 1: "+jogador1.getDado());

            dado = sorteio.nextInt(1, 7);;
            jogador2.setDado(dado);
            System.out.println("Jogador 2: "+jogador2.getDado());

            if(jogador1.getDado()>jogador2.getDado()){
                System.out.println("Jogador 1, "+jogador1.getNome()+" ganhou a "+(i+1)+"º Rodada");
                pontos1++;
            }
            else if(jogador1.getDado()<jogador2.getDado()){
                System.out.println("Jogador 2, "+jogador2.getNome()+" ganhou a "+(i+1)+"º Rodada");
                pontos2++;
            }
            else{
                System.out.println("A Rodada "+(i+1)+" Empatou");
            }
            System.out.println();
        }
        System.out.println();
        if(pontos1>pontos2){
            System.out.println("Jogador 1, "+jogador1.getNome()+" foi o ganhador da disputa!");
        }
        else if(pontos1<pontos2){
            System.out.println("Jogador 2, "+jogador2.getNome()+" foi o ganhador da disputa!");
        }
        else{
            System.out.println("Empate!");
        }
    }
}
