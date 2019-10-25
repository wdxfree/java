package Spring.beans;

import org.springframework.stereotype.Component;

//TestOne 采用xml配置<bean>标签的方式


public class TestBeanOne {
    public TestBeanOne(String name, double aDouble) {
        this.name = name;
        this.aDouble = aDouble;
    }

    private  String name;
    private double aDouble;

    public void setName(String name) {
        this.name = name;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public  TestBeanOne(){
        this.name="BeanOne";
        this.aDouble=0;
    }



    public String getName() {
        return name;
    }

    public void TestOne(){
        System.out.println("测试TestBeanOne 的获取方式");
    }



}
