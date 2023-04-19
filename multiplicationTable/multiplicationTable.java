package multiplicationTable;

import java.util.Scanner;

public class multiplicationTable {


    static void multiply(int x){
        for(int i=1; i<=10; i++){
            System.out.println(x+" "+"x"+" "+i+"="+" "+x*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter which table you want to print");
        int n = sc.nextInt();

        multiply(n);
    }
    
}
