package Exercicio_04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cliente extends Pessoa{
    public Cliente (String nome, int id){
        super(nome, id);
    }

    //__________CADASTRAR CLIENTE
    public static Cliente cadastrarCliente(ArrayList<Integer> listID){
        Scanner leitor =  new Scanner(System.in);
        Random random = new Random();
        int id;

        System.out.println("\nNome do Cliente:");
        String nome = leitor.nextLine();
        
        do {
            id = 1000 + random.nextInt(9000); // GERADOR DE ID
        } while (listID.contains(id));

        Cliente cliente = new Cliente(nome, id);
        return cliente;
    }
    
    // IMPRIMIR
    public static void imprimirCliente(Cliente cliente){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n__________"+"\nCliente");
        System.out.println("Nome do Cliente: "+cliente.getNome());
        System.out.println("ID do Cliente: "+cliente.getId());
        System.out.println();
        leitor.nextLine();
    }
    
    // BUSCAR CLIENTE
    public static Cliente buscarCliente(ArrayList<Integer> listIDCliente, ArrayList<Cliente> listClientes){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\nInforme o ID do Cliente:");
        int id = leitor.nextInt();
        int i=0;
        
        if(listIDCliente.contains(id)){
            do{
                if(id==listClientes.get(i).getId()){
                    return listClientes.get(i);
                }
                i++;
            }while(true);
        }else{
            return null;
        }
    }
}
