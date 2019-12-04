package study.unti;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Author
 */


public class DateToCronTest {

    @Test
    public void getCron() {
        String cron = DateToCron.getCron(new Date());
        System.out.println(cron);
    }
}