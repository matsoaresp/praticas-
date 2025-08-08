package page_2;

import java.util.Scanner;

public class positive_values {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i = 1; i <= 6; i++){
            double n = sc.nextDouble();
            if (n > 0.0){
                count++;
            }
        }
        int valores = count;
        System.out.println(valores+" valores positivos");


        sc.close();
    }
}
