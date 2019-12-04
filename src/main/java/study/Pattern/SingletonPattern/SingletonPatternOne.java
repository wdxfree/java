package study.Pattern.SingletonPattern;

//饿汉模式
public class SingletonPatternOne {

    //static 保证了整个类中只存在这样一个SingletonPatternOne 类型的实例。缺点类加载的时候直接将类实例化
    private static  SingletonPatternOne singletonPatternOne = new SingletonPatternOne();


    private SingletonPatternOne(){

    }

    public static SingletonPatternOne getInstance(){
        return singletonPatternOne;
    }
}
