package depois;

public class Professor{
    private String nome;
    private Titulacao titulacao;
    private double salarioBase;
    private double salario;

    public Professor(String nome, Titulacao titulacao, double salarioBase, double salario){
        this.nome = nome;
        this.titulacao = titulacao;
        this.salarioBase = salarioBase;
        this.salario = salario;
    }

    //NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //TITULACAO
    public Titulacao getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    //SALARIO BASE
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //SALARIO
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
