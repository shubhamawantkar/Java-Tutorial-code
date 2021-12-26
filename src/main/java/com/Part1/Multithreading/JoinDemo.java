package com.Part1.Multithreading;


// Using join() to wait for threads to finish.

class NewThread3 implements Runnable{

    String name; // name of thread

    Thread t;

    NewThread3(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: "+t);
    }

    // this is the entry point for thread.
    @Override
    public void run() {
        try{
            for(int i=5; i>0; i--){
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name+" Interrupted.");
        }
        System.out.println(name+" exiting.");
    }
}
public class JoinDemo {
    public static void main(String[] args) {
        NewThread3 t1 = new NewThread3("One");
        NewThread3 t2 = new NewThread3("Two");
        NewThread3 t3 = new NewThread3("Three");

        // Start the threads.
        t1.t.start();
        t2.t.start();
        t3.t.start();

        System.out.println("Thread one is alive: "+t1.t.isAlive());
        System.out.println("Thread two is alive: "+t2.t.isAlive());
        System.out.println("Thread three is alive: "+t3.t.isAlive());


        // wait for threads to finish

        try{
            System.out.println("Waiting for threads to finish.");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Thread one is alive: "+t1.t.isAlive());
        System.out.println("Thread two is alive: "+t2.t.isAlive());
        System.out.println("Thread three is alive: "+t3.t.isAlive());

        System.out.println("Main thread exiting.");
    }
}
