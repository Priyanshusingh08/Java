package method;

import java.util.Scanner;

public class largestnum {

    /**
     * @param x
     * @param y
     * @param z
     */
    static void compare(int x, int y, int z){
        if(x>y && x>z){
            System.out.println("largest number is "+x);
        }
        else if(y>x && y>z){
            System.out.println("largest number is "+y);

        }
        else if(z>x && z>y){
            System.out.println("largest number is "+z);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter third number");
        int c = sc.nextInt();

        compare(a, b, c);
    }
}
