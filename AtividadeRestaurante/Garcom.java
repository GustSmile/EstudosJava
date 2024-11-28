package AtividadeRestaurante;

public class Garcom {
    private String nome;
    private String cpf;
    private String telefone;
    private String codigo;

    public Garcom(String nome, String cpf, String telefone, String codigo){
        this.nome=nome;
        this.cpf=cpf;
        this.telefone=telefone;
        this.codigo=codigo;
    }

    //------------------------------NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //------------------------------CPF
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //------------------------------TELEFONE
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
        System.out.println("CPF: "+this.cpf);
        System.out.println("Nome: "+this.nome);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("-----------------------------------");
    }


}
