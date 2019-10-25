package Pattern.ProxyPattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class MyremoteImpl extends UnicastRemoteObject implements Myremote {

    public MyremoteImpl() throws RemoteException {

    }

    @Override
    public String sayHello() {
        return "server";
    }

    public static void main(String[] args) {
        try {
            Myremote myremote =new MyremoteImpl();
            Naming.rebind("RemoteHello",myremote);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
