package Thread;

import java.util.concurrent.locks.LockSupport;

public class TestLockSupport {
    public static void main(String[] args) {
        Thread thread =new Thread(()->{
            System.out.println("begin park");
            System.out.println(Thread.currentThread().isInterrupted());
            while (!Thread.currentThread().isInterrupted()){
                LockSupport.park();
            }

            System.out.println("unpark");
        });

        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main begin unpark");

        thread.interrupt();


    }
}
