package page_3;

import java.util.Scanner;

public class validacaoNota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();

        while (true) {
            double media;

            if (notaA < 0 || notaA > 10) {
                System.out.println("nota invalida");
                notaA = sc.nextDouble();
            }
            if (notaB < 0 || notaB > 10){
                System.out.println("nota invalida");
                notaB = sc.nextDouble();
            }if ((notaA >= 0 && notaA <= 10) &&
            (notaB >= 0 && notaB <= 10)){
                media = (notaA + notaB) / 2.0;
                System.out.printf("media = %.2f%n", media);
                break;
            }


        }
    }
}
