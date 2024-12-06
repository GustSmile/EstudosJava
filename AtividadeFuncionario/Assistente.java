package AtividadeFuncionario;

public class Assistente extends Funcionario {
    private String matricula;
    
    public Assistente(String nome, String endereco, String cpf, String telefone, String codigo,
    double salario, String matricula){
        super(nome, endereco, cpf, telefone, codigo, salario);
        this.matricula = matricula;
    }

    //------------MATRICULA
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void imprimirDados(){
        System.out.println("-----------------------------------");
        System.out.println("            ASSISTENTE");
        System.out.println("NOME:      "+getNome());
        System.out.println("ENDEREÇO:  "+getEndereco());
        System.out.println("CPF:       "+getCpf());
        System.out.println("TELEFONE:  "+getTelefone());
        System.out.println("CODIGO:    "+getCodigo());
        System.out.println("SALARIO:   R$"+getSalario());
        System.out.println("MATRICULA: "+this.matricula);
        System.out.println("-----------------------------------");
    }
}
