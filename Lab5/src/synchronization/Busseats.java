package synchronization;
class Busseats extends Thread
{
static  Synchronizedblock   b;	
int seats;
public void run()

{
b. busTicket(seats);
}

public static void main(String args[])
{
	b =new Synchronizedblock ();
	
	Busseats  t1 =new  Busseats ();
	t1.seats=7;
	t1.start();
	
	Busseats  t2 =new  Busseats ();
	t2.seats=2;
	t2.start();
	
}
}
