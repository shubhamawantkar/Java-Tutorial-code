package com.Part1.Multithreading;

// Create multiple threads.
class NewThread2 implements Runnable{
    String name; // name of thread
    Thread t;
    NewThread2(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: "+t);
    }

    // this is the entry point for thread
    public void run(){
        try {
            for (int i=5; i>0; i--){
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name+" Interrupted");
        }
        System.out.println(name+" Exiting");
    }
}
public class MultiThreadDemo{
    public static void main(String[] args){
        NewThread2 t1 = new NewThread2("one");
        NewThread2 t2 = new NewThread2("two");
        NewThread2 t3 = new NewThread2("three");

        // start the threads.
        t1.t.start();
        t2.t.start();
        t3.t.start();

        try{
            // wait for other threads to end
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting");
    }

}
