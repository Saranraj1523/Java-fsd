package FileHandling;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;


public class Main {

	
	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 String str =in.nextLine();
		 char[] arr= new char[50];
		
		try{
			File file=new File("D://program//test.txt");
			file.createNewFile();
			FileWriter input=new FileWriter("D://program//test.txt");
			input.write(str);
			System.out.println("String is written to the file");
		    input.close();
			FileReader ob = new FileReader("D://program//test.txt");
			ob.read(arr);
			System.out.println(arr);
			File MyFile=new File("D://program//test.txt");
				MyFile.delete();
				System.out.println("file is deleted.");
				
			
			
		}
		catch(Exception ae){
			ae.getStackTrace();
		}

	}

}
