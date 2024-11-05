package AtividadeContaBancaria;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World 2");

        String nomeTeste;

        Conta conta1 = new Conta("Gustavo");
        nomeTeste = conta1.getNome();

        conta1.ImprimirNome();

        System.out.println("Nome teste1: "+conta1.getNome());
        System.out.println("Nome teste2: "+nomeTeste);
    }
}