package AtividadeRestaurante;

public class Produto {
    private String nome;
    private double preco;
    private String codigo;

    public Produto(String nome, double preco, String codigo){
        this.nome=nome;
        this.preco=preco;
        this.codigo=codigo;
    }

    //------------------------------NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //------------------------------PRECO
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //------------------------------CODIGO
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void ImprimirDados(){
        System.out.println("-----------------------------------");
        System.out.println("Nome: "+this.nome);
        System.err.println("Preco: "+this.preco);
        System.out.println("Codigo: "+this.codigo);
        System.out.println("-----------------------------------");
    }

}
