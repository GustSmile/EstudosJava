package AtividadeCarro;

public class Main {
    public static void main(String[] args) {

        double combustivel = 0;
        
        System.out.println("Quantos Quilômetros seu Carro faz por Litro de Combustivel? ");
        double consumo = Metodo.isInteger();
        Carro carro = new Carro(consumo);

        System.out.println("quanto de Combustível deseja adicionar?");
        combustivel = Metodo.isInteger();
        carro.adicionarCombustivel(combustivel);

        System.out.println();
        carro.obterCombustivel();

        System.out.println("Qual a distância que deseja percorrer? ");
        double distancia = Metodo.isInteger();
        carro.andar(distancia);

        carro.obterCombustivel();
        
    }
}
