package page_2;

import java.util.Locale;
import java.util.Scanner;

public class positive_average {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int count = 0;
        double sum = 0;

        for(int i = 1; i <= 6; i++){
            double value = sc.nextDouble();
            if (value > 0){
                count++;
                sum += value ;

            }
        }
        double average = sum / count;
        System.out.println(count+" valores positivos");
        System.out.printf("%.1f",average);

    }
}
