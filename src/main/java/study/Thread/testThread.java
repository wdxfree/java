package study.Thread;

import java.util.Date;

public class testThread extends Thread {
    @Override
    public void run() {
        System.out.println("time");
        System.out.println(new Date());

    }
}
