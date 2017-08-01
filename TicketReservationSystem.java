package Session8Assignment4;

//This system reserves tickets using 4 threads concurrently. Creats ManageTickets object by providing 
//max number of seats availability.
public class TicketReservationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSeats =10;//max seats
	System.out.println("Maximum seats " +maxSeats);
     ManageTickets manageTickets = new ManageTickets(maxSeats);
     BookTicketThread bookThread = new BookTicketThread(manageTickets);
     bookThread.start();
     
     BookTicketThread bookThread2 = new BookTicketThread(manageTickets);
     bookThread2.start();
     
     BookTicketThread bookThread3 = new BookTicketThread(manageTickets);
     bookThread3.start();
     
     BookTicketThread bookThread4 = new BookTicketThread(manageTickets);
     bookThread4.start();
     
     
	}

}
