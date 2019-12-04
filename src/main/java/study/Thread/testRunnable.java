package study.Thread;

public class testRunnable implements Runnable {
    private Thread t;
    private String threadName;

     testRunnable( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }
    public void run() {
        System.out.println("Running " + threadName);
        try {
            Thread.sleep(200000);

        } catch (InterruptedException e) {
            System.out.println("捕获异常");
            System.out.println("调用中断，线程抛出异常并继续执行");



        }


//        while(!study.Thread.currentThread().isInterrupted()){
//            System.out.println("hello");
//        }
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
