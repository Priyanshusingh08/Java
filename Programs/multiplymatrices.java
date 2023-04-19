package Programs;
import java.util.Scanner;

public class multiplymatrices {
    public static void main(String[] args) {
        
        int arr1[][]={{1,2,3},{4,5,6}};
        int arr2[][]={{2,6,3},{8,7,6}};
        int multiply[][] = new int [2][3];

        for(int i=0; i<2; i++){
            for(int j =0; j<3; j++){
                multiply[i][j] = arr1[i][j]*arr2[i][j];
            }
        }

        for(int i=0; i<2; i++){
            for(int j =0; j<3; j++){
                System.out.print(multiply[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
