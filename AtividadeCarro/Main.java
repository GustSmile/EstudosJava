package AtividadeCarro;

public class Main {
    public static void main(String[] args) {

        double combustivel = 0;
        
        System.out.println("Quantos Quilômetros seu Carro faz por Litro de Combustivel?");
        double consumo = Metodo.isInteger();
        System.out.println("E quantos Litros o Tanque do seu Carro comporta?");
        double tanque =  Metodo.isInteger();
        Carro carro = new Carro(consumo, tanque);

        do{
            System.out.println("Qual operação deseja realizar?\n 1-Adcionar Gasolina\n 2-Obter Combustível\n 3-Percorrer Percurso\n 0-Finalizar\n");
            int op = Metodo.isIntegerInt();
            
            if(op==1){
                System.out.println("quanto de Combustível deseja adicionar?");
                combustivel = Metodo.isInteger();
                carro.adicionarCombustivel(combustivel);
            }else if(op==2){
                System.out.println();
                carro.obterCombustivel();
            }else if(op==3){
                System.out.println("Qual a distância que deseja percorrer? ");
                double distancia = Metodo.isInteger();
                carro.andar(distancia);
            }
            else if(op==0){
                break;
            }else{
                System.out.println("\nValor não corresponde á nenhuma Operação\n");
            }
        }while(true);
        
    }
}
