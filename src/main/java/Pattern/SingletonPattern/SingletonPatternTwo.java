package Pattern.SingletonPattern;

public class SingletonPatternTwo {
    //懒汉式，只有在使用的时候才创建实例，单例模式就是保证整个类只有一个实例，而关键是static
    private static SingletonPatternTwo singletonPatternTwo = null;
    private SingletonPatternTwo(){

    }

    public static SingletonPatternTwo getInstance(){
        if(singletonPatternTwo==null){
            singletonPatternTwo=new SingletonPatternTwo();

        }
        return singletonPatternTwo;
    }
}
