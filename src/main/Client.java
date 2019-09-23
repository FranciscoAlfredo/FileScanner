package main;

import java.io.File;

public class Client{
	
	private FileScanner fileScanner;
	private File root;

	public Client(String root) {
		this.root=new File(root);
		
		this.fileScanner = new FileScanner(root);
	}

}
