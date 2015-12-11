package fileHandling;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

public class RenameFile {
	public static void main(String... args) throws IOException{
		// File (or directory) with old name
		File file = new File("files/file1.txt");

		// File (or directory) with new name
		File file2 = new File("files/file1_renamed.txt");

		if (file2.exists())
		   throw new java.io.IOException("file exists");

		// Rename file (or directory)
		boolean success = file.renameTo(file2);

		if (!success) {
		   // File was not successfully renamed
		}
	}

}
