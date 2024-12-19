package AtividadeAnimal;

public class Animal {
    
    private String nome;

    public Animal (String nome){
        this.nome = nome;
    }

    //-----------NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("Animal emite som!");
    }
}
