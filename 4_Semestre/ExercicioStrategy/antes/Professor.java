package antes;

public class Professor {
    private String nome;
    private double salario;
    private String titulacao;

    public Professor(String nome, double salario, String titulacao){
        this.nome = nome;
        this.salario = salario;
        this.titulacao = titulacao;
    }

    

    //NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //SALARIO
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //TITULACAO
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

}
