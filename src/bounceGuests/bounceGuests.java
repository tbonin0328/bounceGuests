package bounceGuests;

import acm.program.*;

public class bounceGuests extends ConsoleProgram 
{
		public void run()
		{
			println("Special Party");
			int numGuests = readInt("How many guests?");
			String[] guests = getGuests(numGuests);
			
			while (true)
			{
				String command = getCommand();
				if (command.equals("p"))
				{
					println("Guestlist: " + guestList(guests));
				}
				else if (getCommand() == "b")
				{
					println(getBadboy.toUpperCase + "'s not invited.");
				}
				else if (getCommand() == "-")
				{
					println("Min: " + getAverage(grades));
				}
				else if (getCommand() == "Q")
				{
					break;
				}
				else 
				{
					println("Invalid command");
				}
			}

			println("Goodbye :(");
		}
		
		public String getCommand()
		{
			return readLine("(P)rint Guests, (B)ounce, (Q)uit: ").toLowerCase().trim();
		}
		
		public String[] getGuests (int numStudents)
		{
			String[] guests = new String[numStudents];
			
			for (int i = 0; i < numStudents; i++)
			{
				guests[i] = readLine("Enter Guest " + (i + 1) + ": ");
			}
			
			return guests;
		}
		
		public void getList (String[] items)
		{
			for (String item : items)
			{
				println(item.toUpperCase());
			}
		}
		
		public String getBadboy (String[] items)
		{
			String badboy = "";
			for (String item : items)
			{
				 += item;
			}
			return average;
		}
		
		public double getMin (double[] items)
		{
			return 0;
		}
	}
}
