package server;

import java.rmi.*;
	import java.rmi.registry.*;
	import java.rmi.server.RMIClassLoader;
	import java.util.Properties;
	
public class DynamicProduitServer {
	public static void main(String[] args) {
	try {
			System.setProperty("java.security.policy"," server.policy");
			System.setProperty("java.rmi.server.www", "file:/essaisar/src/www/");
		// set security manager
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		// code loading
		String url = System.getProperty("java.rmi.server.www");
		Class ClasseServeur = RMIClassLoader.loadClass(url, "www.Factory");
		Remote factory = (Remote) ClasseServeur.getConstructors()[0].newInstance();

		// registry
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.rebind("Factory", factory);

		System.out.println("Server ready!");

	    }
	catch (Exception e) {
		e.printStackTrace();
	}
	} 
	}



