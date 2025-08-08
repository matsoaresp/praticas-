package page_2;

import java.util.Scanner;

public class six_number_odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int count = 0;
        for(int i = x; i >= x; i++){
            if (count < 6){
                if(i % 2 != 0){
                    count++;
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
