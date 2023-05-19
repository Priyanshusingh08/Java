package validBracket;

import java.util.Scanner;
import java.util.Stack;


public class validBracket {
    public static void main(String[] args) {
        
      
        int n;
        Stack<String> stack = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of input");
        n = sc.nextInt();
      

        for(int i=0; i<=n; i++){
           String a = sc.nextLine();
           
           if(a=="(" || a=="[" || a=="{"){
                stack.push(a);
           }
           else{

            stack.pop();

           }

        }
        sc.close();

        if (stack.isEmpty()){
            System.out.println("valid");
        }

        
    }
}
