package AtividadeProduto;

public class Produto {
    private String nome;
    private int quant;
    private double preco;
    private Fornecedor fornecedor;

    public Produto(String nome, int quant, double preco, Fornecedor fornecedor){
        this.nome = nome;
        this.quant = quant;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }
    //----------NOME
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    //----------QUANT
    public void setQuant(int quant){
        this.quant = quant;
    }
    public int getQuant(){
        return quant;
    }

    //----------PRECO
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    //----------FORNECEDOR
    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }
    public Fornecedor getFornecedor(){
        return fornecedor;
    }
    public void printFornecedor(){
        System.out.println("DADOS DO FORNECEDOR");
        System.out.println("Nome: "+fornecedor.getNome());
        System.out.println("CPF/CNPJ: "+fornecedor.getId());
    }
}
