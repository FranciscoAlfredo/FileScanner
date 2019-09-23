package main;

import java.io.File;

public class Client extends NameFilter{
	
	private FileScanner fileScanner;
	private File root;

	public Client(String root) {
		super();
		this.root=new File(root);
		
		this.fileScanner = new FileScanner(root);
	}

	@Override
	public boolean accept(String name, String extension) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return false;
	}


}
