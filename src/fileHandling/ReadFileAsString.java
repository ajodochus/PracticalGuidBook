package fileHandling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class ReadFileAsString {
	public static void main(String... args){
		try {
			String fileContent = FileHandler.readAsString(new File("files/file1.txt"));
			System.out.println(fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
