package Exercicio_04;

public class Menu {
    public static void mostrarMenuMain(){
        System.out.println("\nEscolha um Número referente à um Grupo de Aplicações:"
        +"\n 1 - Cadastrar"
        +"\n 2 - Buscar"
        +"\n 3 - Imprimir Todos Itens"
        +"\n 4 - Operações"
        +"\n 0 - Finalizar\n"
        );
    }
    public static void mostrarMenuCadastro(){
        System.out.println("\nEscolha um Número referente à uma Operação de Cadastro:"
        +"\n 1 - Cadastrar Autor"
        +"\n 2 - Cadastrar Cliente"
        +"\n 3 - Cadastrar Livro"
        +"\n 0 - Retornar\n"
        );
    }
    public static void mostrarMenuBusca(){
        System.out.println("\nEscolha um Número referente à uma Operação de Busca:"
        +"\n 1 - Buscar Autor"
        +"\n 2 - Buscar Cliente"
        +"\n 3 - Buscar Livro"
        +"\n 0 - Retornar\n"
        );
    }
    public static void mostrarMenuImpressao(){
        System.out.println("\nEscolha um Número referente à uma Operação de Impressão:"
        +"\n 1 - Imprimir todos Autores"
        +"\n 2 - Imprimir todos Cliente"
        +"\n 3 - Imprimir todos Livro"
        +"\n 0 - Retornar\n"
        );
    }
    public static void mostrarMenuEmprestar(){
        System.out.println("\nEscolha um Número referente à uma Operaçõe:"
        +"\n 1 - Emprestar Livro"
        +"\n 2 - Devolver Livro"
        +"\n 0 - Retornar\n"
        );
    }
}
