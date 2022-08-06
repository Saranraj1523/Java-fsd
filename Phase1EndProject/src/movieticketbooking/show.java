package movieticketbooking;

public class show {
	
		static String seats[][][] = new String[5][6][12];
			
			void display_show_timings()
			{
			    System.out.println("\tMovies Now Playing\t\t\t\t  Timings");
				System.out.print("1.	KGF �              \t\t\t 09:20     12:30    18:30   ");
				System.out.println();
				System.out.print("2.	The Gray Man �  \t\t\t 09:30     12:45    18:20   ");
				System.out.println();
			}
			String check_time(int x,String t)
			{
				switch(x)
				{
				case 1: if(t.equals("09:20")||t.equals("12:30")||t.equals("18:30")){
						return "true";
						}
						else
						{ System.out.println("Time not available"); 
						   return "false";
					    }
						
				case 2: if(t.equals("09:30")||t.equals("12:45")||t.equals("18:20")){return "true";}
						else
						{ 
							System.out.println("Time not available"); 
							return "false";
						}
				
				default: return "false";
				}
			}
			
			void show_empty_seats(String x,int i)
			{
					for(int j=0;j<12;j++)
						if(seats[i-1][x.charAt(0)-'A'][j]!="Full")
						{
							System.out.print(" "+(j+1));
						}
			}
			boolean check_seats(String a,int x,int i)
			{			
					if(seats[i-1][a.charAt(0)-'A'][x-1]!="Full")
								return false;
							else
								return true;
			}
			void fill_seat(String a,int b,int i)
			{
				seats[i-1][a.charAt(0)-'A'][b-1]="Full";
			}
			String getmovie(int x)
			{
				switch(x)
				{
				case 1: return "KGF";
				case 2: return "The Gray Man";
				default: return "";
				}
			}
			public static void main()
			{
			   for(int k =0; k<5;k++)	
				for(int i=0;i<6;i++)
					for(int j=0;j<12;j++)
						seats[k][i][j]="Empty";
			}
		}

