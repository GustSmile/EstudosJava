package AtividadeCarro;

public class Carro {

    double combustivel, consumo;
    public Carro(double consumo){
        this.consumo = consumo;
    }
    public void adicionarCombustivel(double comb)
    {
        this.combustivel+=comb;
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
