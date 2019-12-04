package study.proxy;

import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {
        proxyInterfaceImpl zack=new proxyInterfaceImpl("zack");
        proxyInterface proxyInterface=(proxyInterface) Proxy.newProxyInstance(zack.getClass().getClassLoader(),zack.getClass().getInterfaces(),(proxy,method,arg)->{
            if(method.getName().equals("d")){
                System.out.println("ddddddd");

            }
            return null;

        });
        proxyInterface.d(2);

    }
}
