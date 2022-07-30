package Exception;

public class Throws {
	public void method1()throws Exception
	{
		String str=null;
		System.out.println(str.length());
		
		
	}
	public void method2(){
		try{
		method1();
		}
		catch(Exception ae){
			System.out.println("Exception handled : " +ae.getMessage());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws in=new Throws();
		in.method2();

	}

}

