package AtividadeContaBancaria;

public class Conta{
    private String nome;
    
    public Conta(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public void ImprimirNome(){
        System.out.println("Nome do Titular: "+nome);
    }
}