package study.Pattern.DecoratorPattern;
//具体装饰
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component){         //这一步方法的目的是把装饰与组件组合在一起
        this.component=component;
    }


    @Override
    public double operator() {  //装饰添加的具体方法
        return 234;
    }
}
