package sell;

import java.util.ArrayList;

public interface Methods extends java.rmi.Remote {

    String addSell(Sell sell) throws java.rmi.RemoteException;
    
    ArrayList<Sell> sellList() throws java.rmi.RemoteException;
}
