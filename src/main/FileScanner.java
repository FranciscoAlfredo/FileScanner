package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class FileScanner{

	File root;
	File[] list;
	ArrayList<String> paths = new ArrayList<String>();

	public FileScanner(String root) {
		this.root = new File(root);
	}

	public ArrayList<String> scan(File file, Filter filter) {

		File[] list = file.listFiles();

		try {
			int i = 0;

			while(i<list.length) {
				if (list[i].isDirectory()) {
					this.scan(list[i].getAbsoluteFile(), filter);
				} else {
					if(filter.accept(list[i])) {
						this.paths.add(list[i].getAbsolutePath());
					}
				}
				i++;
			}

		} catch (NullPointerException e) {
			System.out.println("There is no path with the specified name!");
		}
		return this.paths;
	}
	
	public ArrayList<String> scan(File file, ExtensionFilter filter) {

		File[] list = file.listFiles();

		try {
			int i = 0;

			while(i<list.length) {
				if (list[i].isDirectory()) {
					this.scan(list[i].getAbsoluteFile(), filter);
				} else {
					if(filter.accept(list[i])) {
						this.paths.add(list[i].getAbsolutePath());
					}
				}
				i++;
			}

		} catch (NullPointerException e) {
			System.out.println("There is no path with the specified name!");
		}
		return this.paths;
	}
	
	public ArrayList<String> scan(File file) {
//		return this.scan(file, f -> true);
		return this.scan(file, null);
	}
	
	public static void main(String[] args) {
		FileScanner fileScanner = new FileScanner("../FileScanner/src/main");

//		ArrayList<String> paths = fileScanner.scan( fileScanner.root );
//		ArrayList<String> paths = fileScanner.scan(fileScanner.root, file -> file.getName().startsWith("dummy") );
		ArrayList<String> paths = fileScanner.scan(fileScanner.root, new ExtensionFilter("txt") );


		for (String string : paths) {
			System.out.println(string.toString());
		}
	}

}
