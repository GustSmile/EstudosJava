package ExercicioS_01.Exercicio_02;
import java.util.*;

public class Pessoa {

    private int idade;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private String nome;

    public Pessoa(int diaNasc, int mesNasc, int anoNasc, String nome){
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.nome = nome;
    }

    //__________IDADE
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //__________DIA DE NASCENÇA
    public int getDiaNasc() {
        return diaNasc;
    }
    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    //__________MES DE NASCENÇA
    public int getMesNasc() {
        return mesNasc;
    }
    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    //__________ANO DE NASCENÇA
    public int getAnoNasc() {
        return anoNasc;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    //__________NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimePessoa(){
        System.out.println(this.nome+", "+this.idade+" anos");
    }
    public int calculaIdade(int anoAtual){
        int idade = anoAtual - this.anoNasc;
        return idade;
    }

    public void ajustaDataDeNascimento(){
        
        int dia, mes, ano;

            do{
                System.out.println("Que dia você nasceu?");
                dia = Metodo.isNumber();
                if(dia>31){
                    System.out.println("Mentiroso! Nenhum mês possui mais que 31 dias!");
                }else{
                    System.out.println("Que mês você nasceu?");
                    mes = Metodo.isNumber();
                    if(mes==2 && dia>29){
                        System.out.println("O mês de Fevereiro só vai até no máximo dia 29!");
                    }
                    else{
                        if(mes>12){
                            System.out.println("Sinto muito, esse mês não existe... Você também não");
                        }else{
                            if(dia==31 && mes==2 && mes==4 && mes==6 && mes==9 && mes==11){
                                    System.out.println("larga de mentira! Mentiroso!");
                            }else{
                                System.out.println("Que ano você nasceu?");
                                ano = Metodo.isNumber();
                                if(ano%4!=0 && mes==2 && dia>=29){
                                    System.out.println("Impossível irmão, este não é um ano Bissexto para você ter nascido neste dia...");
                                }else{
                                    this.diaNasc = dia;
                                    this.mesNasc = mes;
                                    this.anoNasc = ano;
                                    break;
                                }
                            }
                        }
                    }
                }
            }while(true);
    }
}

