package page_2;

import java.util.Scanner;

public class interval {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int countIn = 0;
        int countOut = 0;
        for (int i = 1; i <= num; i++) {
        int x = sc.nextInt();
        if (x >= 10 && x <= 20) {
            sc.nextLine();
            countIn++;
        } else {
            countOut++;
        }
        }
        System.out.println(countIn+" in");
        System.out.println(countOut+" out");


    }
}
