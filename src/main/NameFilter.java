package main;

public abstract class NameFilter implements Filter{

	public NameFilter() {
		
	}
	
	public boolean accept(String name, String extension) {
		return false;
	}

}
