package itemsadmin


import java.rmi.RMISecurityManager 
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

import sell.Methods; 
import sell.Sell;

class MainController {
	
	def index = { 
		
	}
	
	def sendData = {
		Sell sell = new Sell();
		sell.name = params.name
		sell.surname = params.surname
		sell.docNumber = params.docNumber
		sell.itemNumber = params.itemNumber
		sell.price = params.price
		println params.name
		Registry registry = LocateRegistry.getRegistry("192.168.1.117", 3001);
		Methods stub = (Methods) registry.lookup("Hello");
		String status = stub.addSell(sell);
	}
	
	def list = {
		Registry registry = LocateRegistry.getRegistry("192.168.1.117", 3001);
		Methods stub = (Methods) registry.lookup("Hello");
		List sellList = stub.sellList();
		println sellList[0].name
		render(view:"list" ,model:[slist: sellList])
	}
}
