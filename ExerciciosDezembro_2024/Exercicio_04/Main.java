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
                    Autor autor = cadastrarAutor(listID);
                    listID.add(autor.getId());
                    listIDAutor.add(autor.getId());
                    listAutor.add(autor);
                    imprimirAutor(autor);
                    continue;

                case(2): // CADASTRANDO CLIENTE
                    Cliente cliente = cadastrarCliente(listID);
                    listID.add(cliente.getId());
                    listIDCliente.add(cliente.getId());
                    listClientes.add(cliente);
                    imprimirCliente(cliente);
                    continue;

                case(3): // CADASTRANDO LIVRO
                    if(listAutor.isEmpty()){
                        System.out.println("É preciso haver um Autor cadastrado no Sistema!");
                        leitor.nextLine();
                    }else{
                        Livro livro = cadastrarLivro(listIDLivro, listIDAutor, listAutor);
                        listID.add(livro.getId());
                        listIDLivro.add(livro.getId());
                        listLivros.add(livro);
                        imprimirLivro(livro);
                    }
                    continue;

                case(4): // BUSCANDO AUTOR
                    Autor buscaAutor = buscarAutor(listIDAutor, listAutor);
                    System.out.println("\nBuscando Autor...\n");
                    if(buscaAutor==null){
                        System.out.println("\nID não correspondente à nenhum Autor!");
                        leitor.nextLine();
                    }else{
                        imprimirAutor(buscaAutor);
                    }
                    continue;
                
                case(5): // BUSCANDO CLIENTE
                    Cliente buscaCliente = buscarCliente(listIDCliente, listClientes);
                    System.out.println("\nBuscando Cliente...\n");
                    if(buscaCliente==null){
                        System.out.println("\nID não correspondente à nenhum Cliente!");
                        leitor.nextLine();
                    }else{
                        imprimirCliente(buscaCliente);
                    }
                    continue;

                case(6): // BUSCANDO LIVRO
                    Livro buscaLivro = buscarLivro(listIDLivro, listLivros);
                    System.out.println("\nBuscando Livro...\n");
                    if(buscaLivro==null){
                        System.out.println("\nID não correspondente à nenhum Livro!");
                    }else{
                        imprimirLivro(buscaLivro);
                    }

                case(0):
                    break;

                default:
                    System.out.println("Digite valor válido");
                    continue;
            }break;
        }while(true);
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
    } // IMPRIMIR
    public static void imprimirAutor(Autor autor){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n__________"+"\nAutor");
        System.out.println("Nome do Autor: "+autor.getNome());
        System.out.println("ID do Autor: "+autor.getId());
        System.out.println();
        leitor.nextLine();
    } // BUSCAR AUTOR
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
    } // IMPRIMIR
    public static void imprimirCliente(Cliente cliente){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n__________"+"\nCliente");
        System.out.println("Nome do Cliente: "+cliente.getNome());
        System.out.println("ID do Cliente: "+cliente.getId());
        System.out.println();
        leitor.nextLine();
    } // BUSCAR CLIENTE
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



    //__________CADASTRAR LIVRO
    public static Livro cadastrarLivro(ArrayList<Integer>listID,ArrayList<Integer>listIDAutor, ArrayList<Autor>listAutor){
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Titulo do Livro: ");
        String titulo = leitor.nextLine();

        System.out.println("Quantas páginas possui o Livro?");
        int pag;
        do{
            pag = Metodo.isNumber();
            if(pag<3){
                System.out.println("Um Livro deve possuir no mínimo 3 páginas");
            }else{
                break;
            }
        }while(true);

        System.out.println("Informe o código ID do Autor:");
        Autor buscaAutor = buscarAutor(listIDAutor, listAutor);

        int id;
        do {
            id = 1000 + random.nextInt(9000); // GERADOR DE ID
        } while (listID.contains(id));

        Livro livro = new Livro(titulo, buscaAutor, pag, id);
        return livro;
    } // IMPRIMIR
    public static void imprimirLivro(Livro livro){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n__________"+"\nLivro");
        System.out.println("Titulo: "+livro.getTitulo());
        System.out.println("Autor: "+livro.getAutor().getNome());
        System.out.println("quant. Páginas: "+livro.getPaginas());
        System.out.println("ID do Livro: "+livro.getId());
        System.out.println();
        leitor.nextLine();
    } // BUSCAR LIVRO
    public static Livro buscarLivro(ArrayList<Integer> listIDLivro, ArrayList<Livro> listLivros){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\nInforme o ID do Livro:");
        int id = leitor.nextInt();
        int i=0;
        
        if(listIDLivro.contains(id)){
            do{
                if(id==listLivros.get(i).getId()){
                    return listLivros.get(i);
                }
                i++;
            }while(true);
        }else{
            return null;
        }
    }
}


