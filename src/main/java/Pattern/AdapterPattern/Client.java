package Pattern.AdapterPattern;

//Client 需要 Adaptee的post方法，而Adaptee中只存在着get方法
public class Client {


    public static void main(String[] args) {
        Adaptee adaptee =new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.post();
    }
}
