package Pattern.AdapterPattern;
//这是一个适配器，通过这个适配器来转换被适配者
public class Adapter extends Target {
    private  Adaptee adaptee ;

    public Adapter(Adaptee adaptee){
        this.adaptee= adaptee;

    }
    @Override
    public void post() {
        adaptee.get();

    }
}
