
class moviebookingapp{
	int totalSeats=20;
	synchronized void busTickets(int seats) {
		if(totalSeats>=seats) {
			System.out.println("Total seats booked: "+seats);
			totalSeats -= seats;
			System.out.println("Seats left: "+totalSeats);
		}
		else {
			System.out.println("Seats are fully booked!");
		}}
	}
	class Bus extends Thread{
		static moviebookingapp b;
		int seats;
		public void run() {
			b.busTickets(seats);
		}
	}


		
	

