package movieticketbooking;
import java.util.Scanner;
public class login {

	public static boolean happy()
    {
        String username, password;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter username:");
        username = in.nextLine();
        System.out.print("Enter password:");
        password = in.nextLine();
        if(username.equals("xyz") && password.equals("1234"))
        {
            System.out.println("Authentication Successful\n");
            return true;
        }
        else
        {
            System.out.println("Authentication Failed\n");
            return false;
        }
        
    }
}


