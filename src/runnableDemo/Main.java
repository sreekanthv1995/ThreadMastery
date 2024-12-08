package runnableDemo;

class Main {
    public static void main(String[] args) {
        System.out.println(" main thread : "+Thread.currentThread().getName());
        MultithreadingLearning obj = new MultithreadingLearning();
        Thread thread = new Thread(obj);
        thread.start();
    }
}
