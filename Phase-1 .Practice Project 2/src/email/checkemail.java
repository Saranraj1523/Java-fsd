package email;
import java.util.regex.*;    
import java.util.*; 


public class checkemail {


	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<String>();  
        emails.add("saran@gmail.co.in");  
        emails.add("saranraj@gmail.com");  
        emails.add("saran.raj@gmail.com");  
        emails.add("malvoi#@gmail.co.in");  
        emails.add("vengat@gmail.com");  
        emails.add("pasupathi@gmailcom");  
        emails.add("@yahoo.com");  
        emails.add("saran#gmail.com");   
        emails.add("SAran@gmail.com");
        String regex = "^(.+)@(.+)$";   
        Pattern pattern = Pattern.compile(regex);    
        for(String email : emails){  
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  


	}


