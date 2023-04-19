package Programs;
import java.util.Scanner;

public class addMatrics {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        System.out.println("Enter columns");
        int column = sc.nextInt();

        int result [][] = new int [column][row];
        int matrix1 [][] = new int [column][row];
        int matrix2 [][] = new int [column][row];
        int i,j;

        for( i=0; i<column; i++){
            for( j=0; j<row; j++){
                System.out.println("enter array1"+i+""+j );
                matrix1[i][j]= sc.nextInt();
            }
        }
        for( i=0; i<column; i++){
            for( j=0; j<row; j++){
                System.out.println("enter array2"+i+""+j);
                matrix2[i][j]= sc.nextInt();
            }
        }
        for( i=0; i<column; i++){
            for( j=0; j<row; j++){
                result[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        for( i=0; i<column; i++){
            for( j=0; j<row; j++){
               System.out.println(result[i][j]);
            }
            System.out.println(" ");
        }


    }
}
