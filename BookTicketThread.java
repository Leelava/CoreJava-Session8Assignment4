package Session8Assignment4;

import java.util.Scanner;

public class BookTicketThread extends Thread {

	ManageTickets mt;

	public BookTicketThread(ManageTickets mt) {
		super();
		this.mt = mt;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);  
		
		System.out.println("enter the number of tickets");
		int no_Of_Tickets=sc.nextInt();
		mt.bookTickets(no_Of_Tickets);
	}
	
}
