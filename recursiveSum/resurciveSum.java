package recursiveSum;

import java.util.Scanner;

public class resurciveSum {

    static int sum(int x){
        
        return x + sum(x-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        sc.close();

        int result = sum(n);
        System.out.println(result);
        
    }
}
