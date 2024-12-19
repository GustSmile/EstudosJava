package AtividadeAnimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome;

        System.out.println("Seu nome:");
        nome = leitor.nextLine();
        Animal animal = new Animal(nome);

        System.out.println("Nome do Cachorro:");
        nome = leitor.nextLine();
        Cachorro dog = new Cachorro(nome);

        System.out.println("Nome do Gato:");
        nome = leitor.nextLine();
        Gato cat = new Gato(nome);

        System.out.println(animal.getNome()+" faz:");
        animal.emitirSom();

        System.out.println(dog.getNome()+" faz:");
        dog.emitirSom();
        
        System.out.println(cat.getNome()+" faz:");
        cat.emitirSom();
        
    }
}