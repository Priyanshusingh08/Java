package AbstractClass;

abstract class A{
    
    void disp(){
        System.out.println("abc class display");
    }

    abstract void show();
}

class B extends A{
    void disp(){
        System.out.println("object of A is called");
    }
    void show(){
        System.out.println("Implement of show method");
    }
}

class C extends A{
    void show(){
        System.out.println("object of B is called");
    }
}




public class AbstractClass {
    public static void main(String[] args) {

        
        A B1 = new B();
        A B2 = new C();
        B1.disp();
        B1.show();  
        B2.disp();
        B2.show(); 
    }
}
