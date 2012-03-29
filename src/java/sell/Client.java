package sell;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author gbringas
 */
public class Client {

    private Client() {
    }

    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.getRegistry("192.168.1.114", 3001);
            Methods stub = (Methods) registry.lookup("Hello");

            Sell sell = new Sell();
           
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el nombre");
            sell.name = in.readLine();
            System.out.println("Ingrese el apellido");
            sell.surname = in.readLine();
            System.out.println("Ingrese el numero de documento");
            sell.docNumber =in.readLine();
            System.out.println("Ingrese el numero de articulo");
            sell.itemNumber =in.readLine();
            System.out.println("Ingrese el precio");
            sell.price =in.readLine();
            String response = stub.addSell(sell);
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
