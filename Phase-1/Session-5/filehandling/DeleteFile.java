package Com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
	
	public static void main(String[] args) throws NoSuchFieldException {
		
		
		try {
			Path path= Paths.get("D:\\files\\testFileNIO2.txt");
			if(Files.deleteIfExists(path))
				System.out.println("File  deleted");
			else
				System.out.println("File not Deleted");
		} catch (DirectoryNotEmptyException e) {
			// TODO: handle exception
			System.out.println("Directory is not empty");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Invalid Permission");
		}
	}

}
