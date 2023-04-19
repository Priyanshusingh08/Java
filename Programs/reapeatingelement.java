package Programs;

import java.util.Arrays;

public class reapeatingelement {


    static void reapeat(int arr[]){
        Arrays.sort(arr);

        for(int i =0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                System.out.println("Repeated elements are : "+arr[i+1]);
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,3,4,3,6,7,2,6};
        
        reapeat(arr);

    }    
}
