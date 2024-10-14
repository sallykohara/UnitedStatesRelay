package swimRelay;
import java.util.ArrayList;


public class swimRelay
{

	public static void main(String[] args) 
	{
		

	}
	class Relay
	{
		private String name; 
		private double time; 
		
		public Relay(String n, double t)
		{
			name = n;
			time = t;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String n)
		{
			name = n;
		}
		public double getTime()
		{
			return time;
		}
		public void setTime(double t)
		{
			time = t;
		}
	}
	
	class RelayLane
	{
		static ArrayList<Relay>team = new ArrayList<Relay>();
		public static void fillTeam()
		{
			team.add(new Relay("Canada", 0)); // how do i put in the 3:15.66 in here? 
			team.add(new Relay("Sweden", 0));
			team.add(new Relay("Australia", 0));
			team.add(new Relay("United States", 0));
			team.add(new Relay("France", 0));
			team.add(new Relay("Italy", 0));
			team.add(new Relay("South Africa", 0));
			team.add(new Relay("Great Britain", 0));
			
		}
	}
	
	public static void sort()
	{
		System.out.println("We're getting ready to swim the 400 freestyle relay at the 2016 Rio Olympics!! Here are the relays sorted from slowest to fastest:");
		System.out.println("1: Canada, Time = 3:15.66");
		System.out.println("2: Sweden, Time = 3:15.54");
		System.out.println("3: Great Britain, Time = 3:15.23 ");
		System.out.println("4: South Africa, Time = 3:14.89");
		System.out.println("5: Australia, Time = 3:14.65");
		System.out.println("6: Italy, Time = 3:13.45");
		System.out.println("7: France, Time = 3:12.36");
		System.out.println("8: United States, Time = 3:12.23");
		delay(); 
		
		System.out.println(" ");
		System.out.println("France and the United States have a rivalry, who is going to win this race?");
		System.out.println(" ");
		System.out.println("With the United States seeded first at a 3:12.23, these are the relays in their lanes:");
		
		System.out.println("Lane 1 " + RelayLane.team.get(0).getName());
		System.out.println("Lane 2 " + RelayLane.team.get(1).getName());
		System.out.println("Lane 3 " + RelayLane.team.get(2).getName());
		System.out.println("Lane 4 " + RelayLane.team.get(3).getName());
		System.out.println("Lane 5 " + RelayLane.team.get(4).getName());
		System.out.println("Lane 6 " + RelayLane.team.get(5).getName());
		System.out.println("Lane 7 " + RelayLane.team.get(6).getName());
		System.out.println("Lane 8 " + RelayLane.team.get(7).getName());
		
		// mock the 400 free relay
		
		System.out.println(" ");
		delay();
		System.out.println(" Starting the Mens 400 Freestyle Relay:");
		delay(); 
		System.out.println("First leg swimmers, take your mark... ");
		delay();
		System.out.println("*BEEP*");
		System.out.println("swimmers hop up...take your mark...*BEEP*");
        System.out.println("|     |     |     |     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |     |     |     |");
        System.out.println("|  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |");
        System.out.println("|     |     |     |     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |     |     |     |");
        System.out.println("|     |     |     |     |     |     |     |     |");
    delay();
	}

	
	public static void delay()
    {
      try
        {

              Thread.sleep(3000);
          }
      catch (InterruptedException e) 
        {
          System.out.println("main thread interrupted");
      }
    }
}
