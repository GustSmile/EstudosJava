package AtividadeRestaurante;

public class Pedido {
    private Cliente cliente;
    private Garcom garcom;
    private Produto produto;
    private int mesa;
    
    public Pedido(Cliente cliente, Garcom garcom, Produto produto, int mesa){
        this.cliente=cliente;
        this.garcom=garcom;
        this.produto=produto;
        this.mesa=mesa;
    }

    //------------------------------CLIENTE
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //------------------------------GARCOM
    public Garcom getGarcom() {
        return garcom;
    }
    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    //------------------------------PRODUTO
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    //------------------------------MESA
    public int getMesa() {
        return mesa;
    }
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public void ImprimirDados(){
        System.out.println("--------------PEDIDO--------------");
        System.out.println("Mesa: "+this.mesa);
        System.out.println("Nome do Cliente: "+cliente.getNome());
        System.out.println("Nome Garcom: "+garcom.getNome());
        System.out.println();
        System.out.println("Pedido: "+produto.getNome());
        System.out.println("Conta: R$"+produto.getPreco());
    }
}
