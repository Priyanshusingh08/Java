package patternRightAngle;

import java.util.Scanner;

public class patternRight {

    static void pattern(int x){
        for(int i=0; i<x; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        sc.close();

        pattern(n);
    }
}
