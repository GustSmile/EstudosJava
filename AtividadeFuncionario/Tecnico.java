package AtividadeFuncionario;

public class Tecnico extends Funcionario {
    private String turno;
    private double adicionalNoturno;

    public Tecnico(String nome, String endereco, String cpf, String telefone, String codigo,
    double salario, String turno, double adicionalNoturno){
        super(nome, endereco, cpf, telefone, codigo, salario);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }
    

    //------------TURNO
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    //------------ADICIONAL NOTURNO
    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public void imprimirDados(){
        System.out.println("-----------------------------------");
        System.out.println("             TECNICO");
        System.out.println("NOME:      "+getNome());
        System.out.println("ENDEREÇO:  "+getEndereco());
        System.out.println("CPF:       "+getCpf());
        System.out.println("TELEFONE:  "+getTelefone());
        System.out.println("CODIGO:    "+getCodigo());
        System.out.println("TURNO:     "+this.turno);
        System.out.println("SALARIO:   R$"+getSalario());
        if(turno.equals("Noturno") || turno.equals("noturno")){
        System.out.println("ADICIONAL: R$"+this.adicionalNoturno);
        }
        System.out.println("\nSALÁRIO TOTAL: R$"+(getSalario()+this.adicionalNoturno));
        System.out.println("-----------------------------------");
    }
}
