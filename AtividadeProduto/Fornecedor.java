package AtividadeProduto;

public class Fornecedor {
    private String nome, id;

    public Fornecedor(String nome, String id){
        setNome(nome);
        setId(id);
        /*
         * Ou...
         * this.nome = nome;
         * this.id = id;
         */
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
}
