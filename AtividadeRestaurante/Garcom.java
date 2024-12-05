package AtividadeRestaurante;

public class Garcom extends Pessoa{
    private String codigo;

    public Garcom(String nome, String cpf, String telefone, String codigo){
        super(nome, cpf, telefone);
        this.codigo=codigo;
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
        System.out.println("CPF: "+getCpf());
        System.out.println("Nome: "+getNome());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("-----------------------------------");
    }


}
