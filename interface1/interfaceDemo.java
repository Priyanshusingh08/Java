package interface1;

import java.util.Scanner;

interface Demo{

    default void show(){
        System.out.println("interface method");
    }
    int add(int a,int b);
    void output(int a);
}

class Demo1 implements Demo{

        int a,b;
       public  int add(int a,int b){
            this.a=a;
            this.b=b;

            int result = a+b;

            return result;
        }

        public void output(int a){
                System.out.println(a);
        }

       
}



public class interfaceDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        Demo1 dm = new Demo1();
        int r=dm.add(n, m);
        dm.output(r);
        
    }
}
