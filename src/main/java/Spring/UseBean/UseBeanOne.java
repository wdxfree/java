package Spring.UseBean;


import Spring.beans.TestBeanOne;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseBeanOne {


    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext(new String[]{"classpath:/applicationContext.xml"}); //这为什么是一个数组
        TestBeanOne testBeanOne=(TestBeanOne)applicationContext.getBean("BeanOne");
        testBeanOne.TestOne();
        System.out.println(testBeanOne.getaDouble());
    }

}
