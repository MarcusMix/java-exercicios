package lista_funcoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 	Ex09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] valores = new double [10]; 
        for(int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i+1) + "º número: ");
            valores[i] = entrada.nextDouble();
        }
        System.out.println("\nNúmeros digitados: ");
        for(int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        ArrayList<Double> resultado = processamento(valores);
        System.out.println("\nNúmeros ordenados: ");
        for(Double valor : resultado) {
            System.out.print(valor + " ");
        }
        }

    static ArrayList<Double> processamento(double []valores) {
        Arrays.sort(valores);
        ArrayList<Double> pares = new ArrayList<>();
        ArrayList<Double> impares = new ArrayList<>();
        for(int i = 0; i < valores.length; i++) {
            if(valores[i] % 2 == 0) {
                pares.add(valores[i]);
            }else {
                impares.add(valores[i]);
            }
        }
        pares.addAll(impares);
        return pares;
    }    
}