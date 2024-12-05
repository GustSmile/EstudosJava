package AtividadeRestaurante;

public class Cliente extends Pessoa {
    private String endereco;
    private String email;
    private String observacoes;

    public Cliente(String cpf, String endereco, String nome, String telefone, String email, String observacoes){
        super(nome, telefone, cpf);
        this.endereco=endereco;
        this.email=email;
        this.observacoes=observacoes;
    }


    //------------------------------ENDERECO
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    


    //------------------------------EMAIL
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //------------------------------OBESERVACOES
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void ImprimirDados(){
        System.out.println("-----------------------------------");
        System.out.println("CPF: "+getCpf());
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Nome: "+getNome());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("E-mail: "+this.email);
        System.out.println("Obeservações: "+this.observacoes);
        System.out.println("-----------------------------------");
    }

}
