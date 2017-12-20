package main;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWrite {
	
	public static UserManager userManager = new UserManager();
	public static ShopManager shopManager = new ShopManager();
	
	public FileWrite() {
		
	}
	
	
	@SuppressWarnings("null")
	public static void write(String fileName) throws IOException {
		
		BufferedWriter outputWriter = null;
		for(int i = 0; i < shopManager.usersPasses.length; i++) {
			outputWriter.write(shopManager.usersPasses[i]);
			outputWriter.newLine();
		}
		
		outputWriter.flush();
		outputWriter.close();
		
	}

}
