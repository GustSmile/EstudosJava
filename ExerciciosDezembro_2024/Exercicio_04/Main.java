package Exercicio_04;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int op;
        ArrayList<Autor>   listAutor = new ArrayList<>();
        ArrayList<Cliente> listClientes = new ArrayList<>();
        ArrayList<Livro>   listLivros = new ArrayList<>();
        ArrayList<Integer> listID = new ArrayList<>();
        ArrayList<Integer> listIDAutor = new ArrayList<>();
        ArrayList<Integer> listIDCliente = new ArrayList<>();
        ArrayList<Integer> listIDLivro = new ArrayList<>();

        do{
            Menu.mostrarMenu();
            op = Metodo.isNumber();
            switch (op) {
                case(1): // CADASTRANDO AUTOR
                    Autor autor = Autor.cadastrarAutor(listID);
                    listID.add(autor.getId());
                    listIDAutor.add(autor.getId());
                    listAutor.add(autor);
                    Autor.imprimirAutor(autor);
                    continue;

                case(2): // CADASTRANDO CLIENTE
                    Cliente cliente = Cliente.cadastrarCliente(listID);
                    listID.add(cliente.getId());
                    listIDCliente.add(cliente.getId());
                    listClientes.add(cliente);
                    Cliente.imprimirCliente(cliente);
                    continue;

                case(3): // CADASTRANDO LIVRO
                    if(listAutor.isEmpty()){
                        System.out.println("É preciso haver um Autor cadastrado no Sistema!");
                        leitor.nextLine();
                    }else{
                        Livro livro = Livro.cadastrarLivro(listIDLivro, listIDAutor, listAutor);
                        listID.add(livro.getId());
                        listIDLivro.add(livro.getId());
                        listLivros.add(livro);
                        Livro.imprimirLivro(livro);
                    }
                    continue;

                case(4): // BUSCANDO AUTOR
                    Autor buscaAutor = Autor.buscarAutor(listIDAutor, listAutor);
                    System.out.println("\nBuscando Autor...\n");
                    if(buscaAutor==null){
                        System.out.println("\nID não correspondente à nenhum Autor!");
                        leitor.nextLine();
                    }else{
                        Autor.imprimirAutor(buscaAutor);
                    }
                    continue;
                
                case(5): // BUSCANDO CLIENTE
                    Cliente buscaCliente = Cliente.buscarCliente(listIDCliente, listClientes);
                    System.out.println("\nBuscando Cliente...\n");
                    if(buscaCliente==null){
                        System.out.println("\nID não correspondente à nenhum Cliente!");
                        leitor.nextLine();
                    }else{
                        Cliente.imprimirCliente(buscaCliente);
                    }
                    continue;

                case(6): // BUSCANDO LIVRO
                    Livro buscaLivro = Livro.buscarLivro(listIDLivro, listLivros);
                    System.out.println("\nBuscando Livro...\n");
                    if(buscaLivro==null){
                        System.out.println("\nID não correspondente à nenhum Livro!");
                        leitor.nextLine();
                    }else{
                        Livro.imprimirLivro(buscaLivro);
                    }
                    continue;

                case(0):
                    break;

                default:
                    System.out.println("Digite valor válido");
                    continue;
            }break;
        }while(true);
    }



    



    



    
}

