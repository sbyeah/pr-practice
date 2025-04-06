package assignment;

import java.util.Scanner;

class BOJ2439 {
    public static void main(String[] args) {
        int count;
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        sc.close();
        for(count = 0;count < limit; count++){
            for(int n = limit ; n > count ; n--){
                System.out.print(" ");
            }
            for(int m = 0 ; m < count ; m++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}