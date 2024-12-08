package runnableDemo;

public class MultithreadingLearning implements Runnable{


    @Override
    public void run() {
        System.out.println("code executed by thread : "+Thread.currentThread().getName());
    }
}
