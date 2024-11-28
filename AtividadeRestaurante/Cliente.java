package AtividadeRestaurante;

public class Cliente {
    private String cpf;
    private String endereco;
    private String nome;
    private String telefone;
    private String email;
    private String observacoes;

    public Cliente(String cpf, String endereco, String nome, String telefone, String email, String observacoes){
        this.cpf=cpf;
        this.endereco=endereco;
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
        this.observacoes=observacoes;
    }

    //------------------------------CPF
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //------------------------------ENDERECO
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //------------------------------NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //------------------------------TELEFONE
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
        System.out.println("CPF: "+this.cpf);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Nome: "+this.nome);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("E-mail: "+this.email);
        System.out.println("Obeservações: "+this.observacoes);
        System.out.println("-----------------------------------");
    }

}
