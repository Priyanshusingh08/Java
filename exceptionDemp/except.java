package exceptionDemp;

public class except {

     public static void main(String[] args) {
        try {
            int a =10;
            int b=0;
            int div= a/b;   
            System.out.println(div);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Exception calling");
        }
     }   
   
}
