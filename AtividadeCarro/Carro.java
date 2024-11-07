package AtividadeCarro;

public class Carro {

    double combustivel, consumo;
    public Carro(double consumo){
        this.consumo = consumo;
        adicionarCombustivel(combustivel);
        obterCombustivel();
    }
    public void adicionarCombustivel(double comb)
    {
        this.combustivel+=comb;
    }
    public void obterCombustivel(){
        System.out.println(this.combustivel+" L de Combustível");
    }
    public void andar(double distancia){
        double totalCombustivel = consumo*combustivel;
        double totalConsumo = distancia/consumo;
        if (totalCombustivel<distancia){
            System.out.println("Combustivel insuficiente");
        }
        else{
            System.out.println("Foi possível efetuar o percurso");
            combustivel-=totalConsumo;
        }
    }
}
