package study.unti;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class YmlTestTest {
    @Autowired
    private YmlTest ymlTest;

    @Test
    public void ex(){
        System.out.println(ymlTest);
    }


}