package Synchronized;

public class Mainclass {
	
	
		int count;
		public synchronized void increment()
		{
			count++;
		}
	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Mainclass c = new Mainclass();
			
			Thread method1 = new Thread(new Runnable() {
				public void run()
				{
					int i;
					for( i=1;i<=2000;i++)
					{
						c.increment();
					}
				}
				
			});
			Thread method2 = new Thread(new Runnable() {
				public void run()
				{
					int j;
					for( j=1;j<=2000;j++)
					{
						c.increment();
					}
				}
				
			});
			method1.start();
			method2.start();
			try {
				method1.join();
				method2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("count " + c.count);
			

		}

	}

