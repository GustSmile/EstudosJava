public class Main {
    public static void main(String[] args) {
        System.out.println("Confere CPF");
        String cpf;

        cpf = Metodo.isInteger();
        
        
        cpf = Metodo.FormatarCPF(cpf);
        System.out.println("CPF: "+cpf);;
    }
}