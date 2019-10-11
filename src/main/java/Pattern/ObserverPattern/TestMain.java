package Pattern.ObserverPattern;

public class TestMain {
    public static void main(String[] args) {
        Subject subject=new SubjectImp("主题");
        Observer observer=new ObserverImp(subject);
        Observer observer1=new ObserverImp(subject);

        subject.notifyupdate("测试");
    }
}
