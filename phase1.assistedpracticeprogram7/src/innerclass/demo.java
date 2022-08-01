package innerclass;

public class demo {
	 int num;
	   
	   // inner class
	   private class Inner_Demo {
	      public void print() {
	         System.out.println("This is an inner class");
	      }
	   }
	   
	   // Accessing he inner class from the method within
	   void display_Inner() {
	      Inner_Demo in = new Inner_Demo();
	      in.print();
	   }
	
	   
	

	   public static void main(String args[]) {
	      // Instantiating the outer class 
	      demo out = new demo();
	      
	      // Accessing the display_Inner() method.
	      out.display_Inner();
	   }
	}


