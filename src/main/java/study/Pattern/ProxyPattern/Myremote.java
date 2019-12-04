package study.Pattern.ProxyPattern;

import java.rmi.Remote;

public interface Myremote extends Remote {
    public String sayHello();
}
