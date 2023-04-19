package Programs;
import java.util.Arrays;
import java.util.Scanner;

public class missingelement {
    public static void main(String[] args) {
        
        int n;

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter length of an array");
        n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter element "+ (i+1));
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=0; i<n; i++){
            if (arr[i]!=i+1){
                System.out.println(i+1+" "+"Number is missing ");
                break;
            }
        }

        

    }
}
