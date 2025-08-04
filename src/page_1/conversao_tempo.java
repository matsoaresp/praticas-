package page_1;

import java.util.Scanner;

public class conversao_tempo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int minutos = valor / 60;
        int segundos = valor % 60;
        int horas = minutos / 60;
        int minutos_convert = minutos % 60;


        System.out.println(horas+":"+minutos_convert+":"+segundos);





    }
}
