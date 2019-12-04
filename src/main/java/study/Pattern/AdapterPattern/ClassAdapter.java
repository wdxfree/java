package study.Pattern.AdapterPattern;

public class ClassAdapter  extends ClassAdaptee implements ClassTarget{
    public void post(){
        //类适配器，通过调用所继承的父类方法来完成对对象的转变，而不是通过构造函数把一个对象转换成另一个对象。
        super.get();
    }
}
