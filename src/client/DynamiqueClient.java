package client;

import java.rmi.server.RMIClassLoader;
	import java.util.Properties;
	import java.util.*;
	import java.lang.reflect.Constructor;
	import java.rmi.RMISecurityManager;
public class DynamiqueClient {
	
	public DynamiqueClient  () throws Exception {
		System.setProperty("java.rmi.server.www", "file:/essaisar/src/www/");
		System.setProperty("java.security.policy", "essaisar/src/client/client.policy/");

		// set security manager
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

	Properties p = System.getProperties();
	String url = p.getProperty("java.rmi.server.www");
	Class ClasseClient = RMIClassLoader.loadClass(url,"www.MatrixPClient");
		ClasseClient.getConstructors()[0].newInstance(); // new Client();

	}
	
	public static void main (String [] args) {

	try{
	DynamiqueClient client = new DynamiqueClient();
	}
	catch (Exception e) {
	System.out.println (e.toString());
	}
	}

	
	}

