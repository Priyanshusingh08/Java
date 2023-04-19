package exp6;

class shape{

    void show(){
        System.out.println("This is parent class");
    }
    void draw()
    {
        System.out.println("Main Class Shape");
    }
}

class Circle extends shape{
        void draw(){
            System.out.println("Draw function of circle ");
        }

        void erase(){
            System.out.println("Erase Circle");
        }

}
class Square extends shape{
    void draw(){
        System.out.println("Draw function of square ");
    }

    void erase(){
        System.out.println("Erase Square");
    }
}
class Triangle extends shape{
    void draw(){
        System.out.println("Draw function of Triangle");
    }

    void erase(){
        System.out.println("Erase Triangle");
    }
}


public class exp6 {
    public static void main(String[] args) {
        
        shape A1;        
        shape A = new shape();
        Circle B = new Circle();

        A1=new Circle();
        A1.draw();
        System.out.println("Hello");
//        A1.draw();
        

        
        
    }
}
