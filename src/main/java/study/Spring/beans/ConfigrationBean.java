package study.Spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //通过Configuration 来创建配置类
public class ConfigrationBean {

    @Bean //在使用@Bean的方法来初始化bean对象
    public ClassBean creatBean(){
        System.out.println("初始化");
        ClassBean classBean=new ClassBean();
        classBean.setDescription("这是修改过的声明");
        classBean.setNum(10);
        return classBean;
    }

    @Bean //如果我创建两个同名的并
    public ClassBean createBeanClass(){
        return new ClassBean();
    }
}
