package Programs;
import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        int n;
        float sum=0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("How many number you want to add");

        n = sc.nextInt();
        float [] num = new float [n];

       for(int i =0; i<n; i++){
        num[i]=sc.nextFloat();
       }

       for (float f : num) {
        sum = sum+f;
       }
       System.out.println(sum);
    }
}
