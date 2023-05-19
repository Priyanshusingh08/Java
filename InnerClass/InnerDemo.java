package InnerClass;

public class InnerDemo {

    static int a =10;
    static int b= 20;

    class InnerTest{
        
        int a;
        int b;


        int  sum(int a, int b){
        System.out.println("zx");

            return a+b;
        }
        
    }



    public static void main(String[] args) {
       InnerDemo n = new InnerDemo();
       n.sum(4,6);
    }
}
