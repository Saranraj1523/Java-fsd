package methodcalling;

public class Method {
	public int calculate(int a,int b)
	{
		return a+b;
	}
	public int calculate(int r)
	{
		int c = (22/7)*(r*r);
		return c;
	}
	public int calculat(int a,int b)
	{
		int c=2*(a+b);
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method in=new Method();
		int a=in.calculate(6,6);
		int b=in.calculate(9);
		int c=in.calculat(6,9);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}


