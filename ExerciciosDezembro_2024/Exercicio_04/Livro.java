package Exercicio_04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private int id;
    private int quantidade;

    public Livro (String titulo, Autor autor, int paginas, int id, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.id = id;
        this.quantidade = quantidade;
    }

    //__________TITULO
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //__________AUTOR
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    //__________PAGINAS
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    //__________ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    //__________QUANTIDADE
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

        Autor buscaAutor = Autor.buscarAutor(listIDAutor, listAutor);

        int id;
        do {
            id = 1000 + random.nextInt(9000); // GERADOR DE ID
        } while (listID.contains(id));

        System.out.println("Qual a quantidade deste Livro?");
        int quant = Metodo.isNumber();

        Livro livro = new Livro(titulo, buscaAutor, pag, id, quant);
        return livro;
    }
    
    // IMPRIMIR
    public static void imprimirLivro(Livro livro){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n__________"+"\nLivro");
        System.out.println("Titulo:        "+livro.getTitulo());
        System.out.println("Autor:         "+livro.getAutor().getNome());
        System.out.println("quant/Páginas: "+livro.getPaginas());
        System.out.println("ID do Livro:   "+livro.getId());
        System.out.println("Quantidade:    "+livro.getQuantidade());
        System.out.println();
        leitor.nextLine();
    }
    
    // BUSCAR LIVRO
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
    
    /* EMPRESTAR LIVRO
    public static void emprestarLivro(ArrayList<Livro> listLivros, ArrayList<Integer>listIDLivros,ArrayList<Cliente> listClientes, ArrayList<Integer>ListIDCliente){
        Scanner leitor = new Scanner(System.in);
        Livro livro = buscarLivro(listIDLivros, listLivros);
    }
         */
}
