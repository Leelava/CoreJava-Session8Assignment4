package Session8Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageTickets {
static int maxSeats;
int availableSeats;

String[] passangerArray;

//constructor initializes array, available seats and MaxSeats data members
public ManageTickets(int maxNoSeats) {
	
	this.availableSeats = maxNoSeats;
	maxSeats = maxNoSeats;
	passangerArray = new String[maxNoSeats];
}

//This method cheks availability of seats and books the same. If the requested no of seats is
//more than the available it returns saying the available seats are less than rqrd number.
synchronized void bookTickets(int no_Of_Tickets)
{
	if (no_Of_Tickets <= availableSeats)
	{ int i= 1;
	 while( i<=no_Of_Tickets)
	 {
		 
		 int position = maxSeats -this.availableSeats;
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Keyin the Passanger Name");
			 String name =sc.next();
			 
				 passangerArray[position] = name;
		
		availableSeats = availableSeats - 1;
		i++;
	 }
	 System.out.println("Booking successfull , total no of allocated seats" +(maxSeats -availableSeats));	 
	} 
	
	else {
		
		System.out.println("only " +this.availableSeats +"available, try again");
		}
	
	}
}



