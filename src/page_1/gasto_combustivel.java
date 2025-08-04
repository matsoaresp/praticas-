package page_1;

import java.util.Scanner;

public class gasto_combustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tempo gasto e a velocidade média: ");
        double tempo_gasto = sc.nextDouble();
        double velocidade_media = sc.nextDouble();

        double distancia_percorrida = tempo_gasto * velocidade_media;
        double quantidade_litros = distancia_percorrida / 12 ;
        System.out.printf("%.3f", quantidade_litros);

    }
}
