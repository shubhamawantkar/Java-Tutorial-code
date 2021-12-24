package com.Part1.Multithreading;

class NewThread1 extends Thread{
    NewThread1(){
        // Create a new, second Thread
        super("Demo Thread");
        System.out.println("Child thred: "+this);
    }

    // this is the entry point for the second thread.
    public void run(){
        try {
            for(int i=5; i>0; i--){
                System.out.println("child Thread: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        NewThread1 nt = new NewThread1();  // create a new thread

        nt.start(); // start the thread

        try{
            for(int i =5; i>0; i--){
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted.");
        }
        System.out.println("Main thread exiting");
    }
}
