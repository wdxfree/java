package Thread;

import unti.testTimer;

import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

public class ThreadPool {
    public static void main(String[] args) {
        System.out.println("start");


        Timer timer=new Timer();
        timer.schedule(new testTimer(),0,500);
        try {
            Thread.sleep(500);
            System.out.println("这是主线程");

        }catch (Exception e){
            e.printStackTrace();
        }



        final CountDownLatch countDownLatch= new CountDownLatch(1);//设置为1


        for (int i=0;i<6;i++){


            new Thread(()->{

                try {
                    countDownLatch.await();
                    System.out.println(new Date());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }).start();
            System.out.println(i);
        }
        countDownLatch.countDown();//一共会产生6个子线程在等待，然后通过主线程执行到 countDownLatch.countDown();
//
////        * 计数器减一变为0  释放所有等待线程
////        *
    }
}
