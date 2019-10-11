package Pattern.ObserverPattern;

//抽出接口
public interface Subject {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyupdate(Object object);
}
