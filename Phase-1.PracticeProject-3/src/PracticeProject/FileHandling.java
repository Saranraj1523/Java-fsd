package PracticeProject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
	public static void main(String[] args)  throws IOException {
			String str;
			Scanner in=new Scanner(System.in);
			char[] a = new char[120];
			try{
				File file = new File("D://program//file.txt");
				if(file.createNewFile()){
					System.out.println("File is Created");
				}else{
					System.out.println("exists");
				}
				FileWriter input = new FileWriter(file);
				input.write("This is 1st file to create like this. \n");
				System.out.println("Enter the statement which you wants to append...");
				str=in.nextLine();
				input.append(str+"- This statement is appended.");
				input.close();
				FileReader out=new FileReader("D://program//file.txt");
				out.read(a);
				System.out.println(a);
			}catch (IOException ae) {
	            System.out.println("exception occurred " + ae.getMessage());
	        }
		}
}


