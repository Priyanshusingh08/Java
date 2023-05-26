package threadDemo;


class th1 extends Thread{
        public void run(){
            for(int i =0; i<100; i++){
                System.out.println("Thread 1");
            }
        }
}
class th2 extends Thread{
    public void run(){
        for(int i =0; i<100; i++){
            System.out.println("Thread 2");
        }
    }
}


public class threadDemo {
    public static void main(String[] args) {
        th1 t1 = new th1();
        th2 t2 = new th2();

        t1.start();
        t2.start();
    }
}
