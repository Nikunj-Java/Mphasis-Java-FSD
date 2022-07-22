package Com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateWriteFile {
	
	public static void createFileUsingFileClass() throws IOException
	{
		//create file
		File file= new File("D:\\files\\testFile22-07-22.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File  is already Exist");
		}
		
		//write data to that file
		FileWriter  writer= new  FileWriter(file,false);//overWrites file
		//FileWriter  writer= new  FileWriter(file,true);//appends File
		writer.write("Welcometo Simplilearn...!");
		writer.close();
		
		
	}
	
	
	
	public static void createFileUsingOutputStream()  throws IOException
	{
		FileOutputStream out= new FileOutputStream("D:\\files\\testFileOutPutStream.txt");
		String input="Welcome to OutputStream";
		byte array[]=  input.getBytes();
		out.write(array);
		System.out.println("Data Written Successfully");
		out.close();
	}
	
	public static void createFileUsingNIO() throws IOException
	{
		
		Path path=Paths.get("D:\\files\\testFileNIO.txt");
		//write data using file class
		String input="Welcome  to NIO";
		byte array[]=input.getBytes();
		
		Files.write(path, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written Successfully");
		
		
		//if you want to write data of list to  files directly
		Path path1=Paths.get("D:\\files\\testFileNIO1.txt");
		//write data  using Files class
		
		List<String> list=Arrays.asList("This  is my first line","This is my secondLine");
		Files.write(path1, list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Lines Written Successfully");
		
	}
	
	
	public static void main(String[] args) {
		try {
			 createFileUsingFileClass();
			 //createFileUsingOutputStream();
			 //createFileUsingNIO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
