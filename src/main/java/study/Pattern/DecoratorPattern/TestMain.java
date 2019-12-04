package study.Pattern.DecoratorPattern;

public class TestMain {
    public static void main(String[] args) {
        Component component = new ConcreteComponent(); //创建一个具体组件
        component = new ConcreteDecorator(component);  //利用装饰的构造方法，来与组件组合在一起,完成功能的动态扩展
        System.out.println(component.operator());
    }


}
