package Exercicio_03;

public class Triangulo {
    public int[] lados = new int[3];
    private int i = 0;

    public void inserirLado(int valor){
        lados[i] = valor;
        i++;
    }

    public void tipoTriangulo(){
        for (i=0; i<3; i++){
            for(int a=i; a<3; a++){
                if(lados[i]<lados[a]){
                    int b = lados[i];
                    lados[i]=lados[a];
                    lados[a]= b;
                }
            }
        }
        System.out.println(lados[0]);
        System.out.println(lados[1]);
        System.out.println(lados[2]);

        int valorMaior, restante;
        valorMaior = lados[0];
        restante = lados[1]+lados[2];

        if(lados[0]==lados[1] && lados[1]==lados[2]){
            System.out.println("Este é um Triângulo Equilátero!");
        }
        else if(valorMaior>=restante){
            System.out.println("Isto não é um Triângulo!");
        }
        else if(lados[0] != lados[1] && lados[1] != lados[2] && lados[0] != lados[2]){
            System.out.println("Este é um Triângulo Escaleno!");
        }
        else{
            System.out.println("Este é um Triângulo Isósceles!");
        }
        
    }

}
