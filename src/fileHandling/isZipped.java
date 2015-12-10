package fileHandling;

import org.openqa.selenium.io.FileHandler;

public class isZipped {
	public static void main(String... args){
		System.out.println(FileHandler.isZipped("files/file1.txt"));
	}
}
