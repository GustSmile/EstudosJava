package TesteJogoDados;

public class Jogador {
    private String nome;
    private int[] dado = new int[3];
    private int pos=-1;
    public Jogador(){
        this.nome = nome;
        this.dado = dado;
    }
    public void setNome(String name){
        nome = name;
    }
    public String getNome(){
        return nome;
    }
    public void setDado(int valor){
        pos++;
        dado[pos] = valor;
    }
    public void getDadoPrint(){
        System.out.println(dado[pos]);
    }
    public int getDado(){
        return dado[pos];
    }
    public void getTodosDados(){
        for (int dad:dado){
            System.out.println(dad);
        }
        
    }
}