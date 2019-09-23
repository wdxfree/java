package proxy;

public class proxyInterfaceImpl implements proxyInterface {
    private String name;

    public proxyInterfaceImpl(String name) {
        this.name = name;
    }

    @Override
    public void body() {
        System.out.println("body");
    }

    @Override
    public void year() {
        System.out.println("year");

    }
    @Override
    public void d(int i){
        System.out.println(i);

    }
}
