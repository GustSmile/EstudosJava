package AtividadeFuncionario;

public class Funcionario extends Pessoa{
    private String codigo;
    private double salario;

    public Funcionario(String nome, String endereco, String cpf, String telefone, String codigo, double salario){
        super(nome, endereco, cpf, telefone);
        this.codigo = codigo;
        this.salario = salario;
    }
    

    //------------CODIGO
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //------------SALARIO
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
