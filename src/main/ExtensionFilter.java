package main;

import java.io.File;

public class ExtensionFilter extends NameFilter {
	
	String extension;

	public ExtensionFilter(String extension) {
		this.extension = extension;
	}

	@Override
	public boolean accept(String name, String extension) {
		if(this.extension.equals(extension)) return true;
		else return false;
	}

}


