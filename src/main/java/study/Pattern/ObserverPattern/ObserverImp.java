package study.Pattern.ObserverPattern;

//这是一个观察者
public class ObserverImp implements Observer{

    public ObserverImp(Subject subject){
        subject.add(this);   //把这些东西加入到object当中
    }

    @Override
    public void update(Object object) {
        System.out.println(object);
    }
}
