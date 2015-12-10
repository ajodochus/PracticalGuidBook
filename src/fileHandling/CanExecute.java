package fileHandling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class CanExecute {
	public static void main(String... args){
		try {
			System.out.println(FileHandler.canExecute(new File("files/file1.txt")));
			FileHandler.makeExecutable(new File("files/file1.txt"));
			System.out.println(FileHandler.canExecute(new File("files/file1.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
