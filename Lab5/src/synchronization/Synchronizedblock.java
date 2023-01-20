//synchronized block
package synchronization;
public class Synchronizedblock 
{
int total_seats=10;

 void  busTicket(int seats) {
   synchronized(this) {
	   
		  if(total_seats>=seats)
		  {
			 System.out.println(seats+ " Seats booked successfully");
			 total_seats=total_seats-seats;
			 System.out.println("seats left "+total_seats);
			 
		  }
		  else {
			  System.out.println("Sorry Seats cannot be booked....!!");
			  System.out.println("seats left "+total_seats);	  
		  }
   }

}
}
