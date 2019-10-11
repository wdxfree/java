package Thread;

public class testMain {
    public static void main(String[] args) {
//        testRunnable testRunnable =new testRunnable("one");
//        testRunnable testRunnable1=new testRunnable("two");
//        testRunnable.start();
//        testRunnable1.start();
//        Thread thread=new testThread();
//        thread.start();

        Thread thread = new Thread(new testRunnable("Test"));
        thread.start();
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main over");
//


    }

}
