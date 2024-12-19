package AtividadePoligono;

public class Poligono {
    private String nome;
    
    public Poligono(String nome){
        this.nome = nome;
    }

    //__________NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarArea(){
        System.out.println("Area de Poligono");
    }

}
