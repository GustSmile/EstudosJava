package Exercicio_04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Autor extends Pessoa{
    public Autor (String nome, int id){
        super(nome, id);
    }

    
    //__________CADASTRAR AUTOR
    public static Autor cadastrarAutor(ArrayList<Integer> listID){
        Scanner leitor =  new Scanner(System.in);
        Random random = new Random();
        int id;

        System.out.println("\nNome do Autor:");
        String nome = leitor.nextLine();
        
        do {
            id = 1000 + random.nextInt(9000); // GERADOR DE ID
        } while (listID.contains(id));

        Autor autor = new Autor(nome, id);
        return autor;
    }
    
    // IMPRIMIR
    public static void imprimirAutor(Autor autor){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n__________"+"\nAutor");
        System.out.println("Nome do Autor: "+autor.getNome());
        System.out.println("ID do Autor: "+autor.getId());
        System.out.println();
        leitor.nextLine();
    }
    
    // BUSCAR AUTOR
    public static Autor buscarAutor(ArrayList<Integer> listIDAutor, ArrayList<Autor> listAutor){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\nInforme o ID do Autor:");
        int id = leitor.nextInt();
        int i=0;
        
        if(listIDAutor.contains(id)){
            do{
                if(id==listAutor.get(i).getId()){
                    return listAutor.get(i);
                }
                i++;
            }while(true);
        }else{
            return null;
        }
    }
}
