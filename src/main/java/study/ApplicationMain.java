package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import study.Cron.MainScheduler;

/**
 * @Author
 */




@SpringBootApplication
public class ApplicationMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ApplicationMain.class);
        MainScheduler mainScheduler =(MainScheduler)run.getBean("MainScheduler");
        mainScheduler.schedulerJob();
    }
}