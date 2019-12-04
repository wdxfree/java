package study.Spring.beans;


import study.Spring.usebean.UseConfigurationBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
//@ContextConfiguration(locations="classpath:/applicationContext.xml")
public class SpringBeanTest {


    @Test
    public void TestOne(){
        //采用构造器的方式
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        TestBeanOne testBeanOne =(TestBeanOne)applicationContext.getBean("BeanOne");
        testBeanOne.TestOne();
    }

    @Test
    public void TestBeanFactory(){
        //采用动态工厂的方式；
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        BeanFactory beanFactory=(BeanFactory)applicationContext.getBean("BeanFactory");
        TestBeanOne testBeanOne=beanFactory.createBean();
        testBeanOne.TestOne();
    }

    @Autowired@Qualifier(value = "creatBean")
    public ClassBean classBean;

    //通过@Configuration 和@Bean的方式创建
    @Test
    public void ConBean(){
        System.out.println(classBean);
    }

    @Autowired
    public UseConfigurationBean useConfigurationBean;

    @Test
    public void  TestBean(){
        useConfigurationBean.TestBean();
    }

}