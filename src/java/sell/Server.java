package sell;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Server implements Methods {

	static ArrayList<Sell> sellList;

	protected Server() throws RemoteException {
	}

	private static final long serialVersionUID = 1L;

	public String addSell(Sell sell) {
		sellList.add(sell);
		return "Carga exitosa de " + sell.name;
	}

	public static void main(String args[]) {
		try {
			sellList = new ArrayList<Sell>();
			Server obj = new Server();
			Methods stub = (Methods) UnicastRemoteObject.exportObject(obj, 0);
			Registry registry = LocateRegistry.getRegistry("192.168.1.117", 3001);
			registry.bind("Hello", stub);
			System.err.println("Server ready");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Sell> sellList() throws RemoteException {
		return sellList;
	}
}
