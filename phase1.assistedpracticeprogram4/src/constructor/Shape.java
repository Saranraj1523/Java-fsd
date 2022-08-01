package constructor;

public class Shape {
double x;
	
	Shape(){
		
	}
	Shape (int a){
		x=a*a;
	}
	Shape (int b,int c){
		x=b*c;
	}
	Shape (float d){
		
		x=3.14*(d*d);
	}
	void area(){
		System.out.println("area is"+x );
		}
	
	void display(int a,int b){
		x=(a*b)/2;
		System.out.println("area of traingle" +x);
	}
	void display(float a,float b){
		x=(a*b)/2;
		System.out.println("area of rhombus" +x);
	}
	public static void main(String[] args){
		Shape square=new Shape(5);
		Shape rectangle=new Shape(5,6);
		Shape circle=new Shape(7f);
		
		square.area();
		rectangle.area();
		circle.area();
		new Shape().display(5,6);
		new Shape().display(3f,5f);
		
	}
}



