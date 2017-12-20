package main;

import java.util.Arrays;

public class UserManager {
	
	public static ShopManager shopManager = new ShopManager();
	
	public UserManager() {
		
		
	}
	
	public void register() {
		for(int i = 0; i < shopManager.usersPasses.length; i++) {
			if(Arrays.asList(shopManager.usersPasses).contains(ShopManager.user + ";" + ShopManager.pass)) {
				System.out.println("You've already registered!");
				shopManager.registerLoginLabel.setText("You've already registered.");
				break;
			}
			if(shopManager.usersPasses[i] == null) {
				shopManager.usersPasses[i] = (ShopManager.user + ";" + ShopManager.pass);
				shopManager.registerLoginLabel.setText("Registered.");
				System.out.println(shopManager.usersPasses[i]);
				break;
			}
			
			
		}
	}
	
	

}
