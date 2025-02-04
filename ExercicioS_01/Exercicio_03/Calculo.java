package Exercicio_03;
import java.util.*;

public class Calculo {
    
    public static void fibonacci(int valor){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.clear();
        lista.add(0);
        lista.add(1);

        for(int i = 1; i<valor; i++){
            int valor1 = lista.get(i);
            int valor2 = lista.get(i-1);

            lista.add(valor1+valor2);
        }
        ArrayList<Integer> listaMostrar = new ArrayList<>();
        for(int i = 0; i<valor; i++){
            listaMostrar.add(lista.get(i));
        }
        System.out.println(listaMostrar);
    }
}
