package study.Pattern.TemplateMethod;

public class ChildClass extends AbstractClass {
    @Override
    public void three() {
        System.out.println("这是在子类定义的方法");
    }

    @Override
    public boolean four(){
        System.out.println("子类选择覆盖了钩子");
        return false;
    }
}
