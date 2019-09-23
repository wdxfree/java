package Thread;

public class testMain {
    public static void main(String[] args) {
//        testRunnable testRunnable =new testRunnable("one");
//        testRunnable testRunnable1=new testRunnable("two");
//        testRunnable.start();
//        testRunnable1.start();
        Thread thread=new testThread();
        thread.start();
    }

}
