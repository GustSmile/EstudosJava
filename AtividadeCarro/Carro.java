package AtividadeCarro;

public class Carro {

    double combustivel, consumo, tanque;
    public Carro(double consumo, double tanque){
        this.consumo = consumo;
        this.tanque = tanque;
    }
    public void adicionarCombustivel(double comb)
    {
        double total = combustivel+comb;
        if(total>tanque){
            System.out.println("Quantidade não suportada pelo Tanque");
        }else{
            combustivel+=comb;
        }
    }
    public void obterCombustivel(){
        System.out.println(this.combustivel+" L de Combustível\n");
    }
    public void andar(double distancia){
        double totalCombustivel = consumo*combustivel;
        double totalConsumo = distancia/consumo;
        if (totalCombustivel<distancia){
            System.out.println("Combustivel insuficiente\n");
        }
        else{
            System.out.println("Foi possível efetuar o percurso\n");
            combustivel-=totalConsumo;
        }
    }
}
