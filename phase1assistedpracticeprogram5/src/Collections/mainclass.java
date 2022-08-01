package Collections;
import java.util.*;

public class mainclass {
	


	
		public static void main(String[] args) {
			Set ob = new HashSet();
			ob.add("Bernadine");
			ob.add("Enemy");
			ob.add("Raj");
			ob.add("Enemy");
			ob.add("Cavein");
			System.out.println(ob);
			Set sortedSet = new TreeSet(ob);
			System.out.println(sortedSet);
		}

	}



