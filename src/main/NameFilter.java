package main;

import java.io.File;

public abstract class NameFilter implements Filter{
	
	public NameFilter(){
	}
	
	public boolean accept(File file) {
		return this.accept(file.getName().split("\\.")[0], file.getName().split("\\.")[1]);
	}
	
	public abstract boolean accept(String name, String extension);

}
