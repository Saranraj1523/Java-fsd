package linearSearch;
import java.util.Scanner;

public class Class {
	
	public static void main(String[] args) {
		
		int arr[]={23,45,67,89,29,67,189,109};
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a value to be searched");
		int key=in.nextInt();
		//search for key
		boolean found=false;
		for(int val : arr){
			if(val==key){
				found=true;
				break;
			}
			
		}
		
		if(found==true)	
		System.out.println("Value is present");
		
		else
			System.out.println("Value is not present");

	}
		}

	
	