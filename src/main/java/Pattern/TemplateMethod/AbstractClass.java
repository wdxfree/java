package Pattern.TemplateMethod;

//模板方法模式，这是一种思想，在子类中可以定义抽象类中的某些算法的执行过程
public abstract class AbstractClass {
    public final void process(){
        one();
        two();
        three();
        if(four()){
            System.out.println("默认启动了钩子");
        }
        else {
            System.out.println("没有启动默认的钩子");
        }
    }

    public void one(){
        System.out.println(1);
    }

    public void two(){
        System.out.println(2);
    }

    public abstract void three();

    public  boolean four(){  //这是一个钩子

        System.out.println("这是一个钩子");
        return true;

    };


}
