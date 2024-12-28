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
            Menu.mostrarMenuMain();
            op = Metodo.isNumber();
            switch (op) {
                case(1): // CADASTROS
                    Menu.mostrarMenuCadastro();
                    op = Metodo.isNumber();
                    switch (op) {
                        case (1):// CADASTRAR AUTOR
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
                        case(0):
                            break;
                        default:
                            System.out.println("Digite valor válido");
                            leitor.nextLine();
                            continue;
                    }continue;
                
                case(2):// BUSCAS
                    Menu.mostrarMenuBusca();
                    op = Metodo.isNumber();
                    switch (op) {
                        case(1): // BUSCANDO AUTOR
                            Autor buscaAutor = Autor.buscarAutor(listIDAutor, listAutor);
                            System.out.println("\nBuscando Autor...\n");
                            if(buscaAutor==null){
                                System.out.println("\nID não correspondente à nenhum Autor!");
                                leitor.nextLine();
                            }else{
                                Autor.imprimirAutor(buscaAutor);
                            }
                            continue;
                        case(2): // BUSCANDO CLIENTE
                            Cliente buscaCliente = Cliente.buscarCliente(listIDCliente, listClientes);
                            System.out.println("\nBuscando Cliente...\n");
                            if(buscaCliente==null){
                                System.out.println("\nID não correspondente à nenhum Cliente!");
                                leitor.nextLine();
                            }else{
                                Cliente.imprimirCliente(buscaCliente);
                            }
                            continue;
                        case(3): // BUSCANDO LIVRO
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
                            leitor.nextLine();
                            continue;
                    }continue;
                
                case(3):
                    Menu.mostrarMenuImpressao();
                    op = Metodo.isNumber();
                    switch (op) {
                        case(1): // IMPRIMINDO TODOS AUTORES
                            imprimirAutores(listAutor);
                            continue;
                        case(2): // IMPRIMINDO TODOS AUTORES
                            imprimirClientes(listClientes);
                            continue;
                        case(3): // IMPRIMINDO TODOS AUTORES
                            imprimirLivros(listLivros);
                            continue;
                        case(0):
                            break;
                        default:
                            System.out.println("Digite valor válido");
                            leitor.nextLine();
                            continue;
                    }continue;
                
                case(4): // OPERAÇÕES
                    Menu.mostrarMenuEmprestar();
                    op = Metodo.isNumber();
                    switch (op) {
                        case(1): // EMPRESTANDO LIVRO
                            if(listClientes.isEmpty()){
                                System.out.println("É preciso haver um Cliente cadastrado no Sistema!");
                            }else if(listIDLivro.isEmpty()){
                                System.out.println("É preciso haver um Livro cadastrado no Sistema!");
                            }else{
                                System.out.println("Emprestando Livro...");
                                Cliente clienteEmprestando = Cliente.buscarCliente(listIDCliente, listClientes);
                                if(clienteEmprestando==null){
                                    System.out.println("\nID não correspondente à nenhum Cliente!");
                                    leitor.nextLine();
                                    continue;
                                }
                                Livro livroEmprestando = Livro.buscarLivro(listIDLivro, listLivros);
                                if(livroEmprestando==null){
                                    System.out.println("\nID não correspondente à nenhum Livro!");
                                    leitor.nextLine();
                                    continue;
                                }
                                if(livroEmprestando.getQuantidade()<=0){
                                    System.out.println("Livro indisponível");
                                    continue;
                                }else{
                                    clienteEmprestando.emprestarLivro(livroEmprestando.getId());
                                    int quantidade = livroEmprestando.getQuantidade()-1;
                                    livroEmprestando.setQuantidade(quantidade);
                                    System.out.println("\nCliente: "+clienteEmprestando.getNome());
                                    System.out.println("ID:        "+clienteEmprestando.getId());
                                    System.out.println("Livros Emprestados:");
                                    clienteEmprestando.imprimirLivrosEmprestados(listLivros);
                                }
                            }
                            leitor.nextLine();
                            continue;
                        
                        case(2): // DEVOLVENDO LIVRO
                            if(listClientes.isEmpty()){
                                System.out.println("É preciso haver um Cliente cadastrado no Sistema!");
                            }else if(listIDLivro.isEmpty()){
                                System.out.println("É preciso haver um Livro cadastrado no Sistema!");
                            }else{
                                System.out.println("Devolvendo Livro...");
                                Cliente clienteDevolvendo = Cliente.buscarCliente(listIDCliente, listClientes);
                                if(clienteDevolvendo==null){
                                    System.out.println("\nID não correspondente à nenhum Cliente!");
                                    leitor.nextLine();
                                    continue;
                                }
                                Livro livroEmprestando = Livro.buscarLivro(listIDLivro, listLivros);
                                if(livroEmprestando==null){
                                    System.out.println("\nID não correspondente à nenhum Livro!");
                                    leitor.nextLine();
                                    continue;
                                }else{
                                    if(clienteDevolvendo.getLivrosEmprestadosID().isEmpty()){
                                        System.out.println("Este Cliente não possui Livros Emprestados");
                                        leitor.nextLine();
                                        continue;
                                    }else{
                                        int n=0;
                                        for(int i=0; i<clienteDevolvendo.getLivrosEmprestadosID().size(); i++){
                                            if(livroEmprestando.getId()==clienteDevolvendo.getLivrosEmprestadosID().get(i)){
                                                clienteDevolvendo.devolverLivro(livroEmprestando.getId());
                                                int quantidade = livroEmprestando.getQuantidade()+1;
                                                livroEmprestando.setQuantidade(quantidade);
                                                System.out.println("\nCliente: "+clienteDevolvendo.getNome());
                                                System.out.println("ID:      "+clienteDevolvendo.getId());
                                                System.out.println("Livros Emprestados:");
                                                clienteDevolvendo.imprimirLivrosEmprestados(listLivros);
                                                n=1;
                                            }
                                        }
                                        if(n==0){
                                            System.out.println("Este Cliente não possui este Livro Emprestado");
                                        }
                                        
                                    }
                                }
                            }
                            leitor.nextLine();
                            continue;
                    case(0):
                        break;
                    default:
                        System.out.println("Digite valor válido");
                        continue;
                }break;
            
                case(0):
                    break;
                default:
                    System.out.println("Digite valor válido");
                    continue;
            }break;
        }while(true);
    }

    public static void imprimirAutores(ArrayList<Autor>Autores){
        System.out.println("AUTORES:");
        for(int i=0; i<Autores.size(); i++){
            System.out.println(Autores.get(i).getNome()+" | ID: "+Autores.get(i).getId());
        }
    }
    public static void imprimirClientes(ArrayList<Cliente>Clientes){
        System.out.println("CLIENTES:");
        for(int i=0; i<Clientes.size(); i++){
            System.out.println(Clientes.get(i).getNome()+" | ID: "+Clientes.get(i).getId());
        }
    }
    public static void imprimirLivros(ArrayList<Livro>Livros){
        System.out.println("LIVROS:");
        for(int i=0; i<Livros.size(); i++){
            System.out.println(Livros.get(i).getTitulo()+" | Quant.: "+Livros.get(i).getQuantidade()+" | ID: "+Livros.get(i).getId());
        }
    }
}


