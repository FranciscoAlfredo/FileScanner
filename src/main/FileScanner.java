package main;

import java.io.File;
import java.util.Collection;

public class FileScanner implements Filter{
	
	File root;

	public FileScanner(String root) {
		this.root = new File(root);
	}

	@Override
	public boolean accept(File file) {
		
		return false;
	}
	
	public Collection<String> scan(){

		return null;
	}
	
	public Collection<String> scan(Filter filter);
	
	public static void main(String[] args) {
		FileScanner fileScanner = new FileScanner("test");
	}
}


