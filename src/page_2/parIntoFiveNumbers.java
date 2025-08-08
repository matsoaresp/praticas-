package page_2;

import java.util.Scanner;

public class parIntoFiveNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        for(int i = 1; i <= 5; i++){
            int num = sc.nextInt();
            if (num % 2 == 0){
                count++;
            }
        }
        System.out.println(count+" valores pares");

    }
}
