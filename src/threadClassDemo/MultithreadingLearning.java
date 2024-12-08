package threadClassDemo;

public class MultithreadingLearning extends Thread{

    @Override
    public void run() {
        System.out.println("code executed by Thread : "+Thread.currentThread().getName());
    }
}
