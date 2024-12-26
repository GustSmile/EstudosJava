package Exercicio_04;

public class Livro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private int id;

    public Livro (String titulo, Autor autor, int paginas, int id){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.id = id;
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

}
