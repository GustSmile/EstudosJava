package AtividadeProduto;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        

        //CADASTRO DO PRODUTO
            System.out.println("Qual o nome do Produto? ");
            String nomeProduto = leitor.nextLine();

            System.out.println("Qual a Quantidade?");
            int quantidadeProduto = Metodo.isIntegerInt();

            System.out.println("Qual o Preço?");
            double precoProduto = Metodo.isIntegerDouble();

            //CADASTRO DO FORNECEDOR
            System.out.println("Qual o nome de seu Fornecedor?");
            String nomeFornecedor = leitor.nextLine();
            System.out.println("Cadastrar:\n1 - CPF\n2 - CNPJ");
            int tipo;
            String id;
            
            do{

                    tipo = Metodo.isIntegerInt();
                    
                    if (tipo==1){
                        System.out.println("Qual o CPF?");
                        do{
                            id = Metodo.isInteger();
                            if (id.length()!=11) {
                                System.out.println("O CPF precisa ter 11(onze) dígitos!");
                            }else{
                                id = Metodo.FormatarCPF(id);
                                System.out.println("CPF: "+id);
                                break;
                            }
                        }while(true);
                        break;
                    }
                    
                    else if(tipo==2){
                        System.out.println("Qual o CNPJ?");
                        do{
                            id = Metodo.isInteger();
                            if (id.length()!=14) {
                                System.out.println("O CNPJ precisa ter 14(quatorze) dígitos!");
                            }else{
                                id = Metodo.FormatarCNPJ(id);
                                System.out.println("CNPJ: "+id);
                                break;
                            }
                        }while(true);
                        break;
                    }
                    
                    else
                    {
                        System.out.println("Insira um Valor Válido");
                    }
                }while(true);
                Fornecedor fornecedor =  new Fornecedor(nomeFornecedor, id);
            
            Produto produtoTeste = new Produto(nomeProduto, quantidadeProduto, precoProduto, fornecedor);
            System.out.println("Nome do Produto: "+produtoTeste.getNome());
            System.out.println("Quantidade do Produto: "+produtoTeste.getQuant());
            System.out.println("Preço do Produto: R$"+produtoTeste.getPreco());
            produtoTeste.printFornecedor();
    }

    
    
}
