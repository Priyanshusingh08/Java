package Sync;

class Demo {
    synchronized void printDemo(int n){
        for(int i=0; i<5; i++){
            System.out.println("n"+i);
        }
        try{
            Thread.sleep(400);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class mythread1 extends Thread {
    Demo t;
    int x;
    mythread1(Demo t, int x){
        this.t=t;
        this.x=x;
    }
        public void run() {
            t.printDemo(x);
        }

    
}

public class SyncDemo{
    public static void main(String[] args) {
        Demo b = new Demo();
        mythread1 ob = new mythread1(b, 5);
        mythread1 ob1 = new mythread1(b, 10);
        ob.start();
        ob1.start();
    }
}