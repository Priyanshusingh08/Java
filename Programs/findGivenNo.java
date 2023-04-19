package Programs;
import java.util.Scanner;

public class findGivenNo {
    public static void main(String[] args) {
        int arr[] = {1,12,43,32,65,3,4,7};
        int flag =0;

        int n;
        System.out.println("Enter number you have to find");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i : arr) {
            if(i==n){
               flag = 1;
               break;
            }
        }

        if(flag==1){
            System.out.println("Number is present in array");
        }
        else{
            System.out.println("Number is not present");
        }
    }
}
