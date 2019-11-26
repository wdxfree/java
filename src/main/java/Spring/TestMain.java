package Spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource({"classpath:applicationContext.xml"})
public class TestMain {


    public static void main(String[] args) {
        SpringApplication.run(TestMain.class);
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        UseConfigurationBean useConfigurationBean =(UseConfigurationBean)classPathXmlApplicationContext.getBean(UseConfigurationBean.class);
//        useConfigurationBean.TestBean();

    }

}
