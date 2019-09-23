package main;

import java.io.File;

public interface Filter {
	boolean accept(File file);
}
