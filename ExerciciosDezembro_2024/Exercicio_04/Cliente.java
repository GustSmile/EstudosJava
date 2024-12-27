package Exercicio_04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cliente extends Pessoa{
    private ArrayList<Integer> livrosEmprestadosID = new ArrayList<>();

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

    // EMPRESTAR LIVROS
    public ArrayList<Integer> getLivrosEmprestadosID() {
        return livrosEmprestadosID;
    }
    public void setLivrosEmprestados(ArrayList<Integer> livrosEmprestadosID) {
        this.livrosEmprestadosID = livrosEmprestadosID;
    }

    public void emprestarLivro(int livroID){
        this.livrosEmprestadosID.add(livroID);
    }
    public void devolverLivro(int livroID){
        for(int i=0; i<livrosEmprestadosID.size(); i++){
            if(livroID == livrosEmprestadosID.get(i)){
                livrosEmprestadosID.remove(i);
            }
        }
    }

    public void imprimirLivrosEmprestados(ArrayList<Livro> livrosEmprestados){
        for(int i=0; i<livrosEmprestadosID.size(); i++){
            for(int n=0; n<livrosEmprestados.size(); n++){
                if(livrosEmprestadosID.get(i)==livrosEmprestados.get(n).getId()){
                    System.out.println(livrosEmprestados.get(n).getTitulo());
                }
            }
        }
    }
    /*public int devolverLivro(ArrayList<Integer> livrosEmprestadosID){

    }*/

}
