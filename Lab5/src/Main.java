import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		moviebookingapp b=new moviebookingapp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter no. of seats: ");
		Bus t1 =new Bus();
		t1.seats=sc.nextInt();
		t1.start();
		System.out.println("Please enter no. of seats: ");
		Bus t2 =new Bus();
		t2.seats=sc.nextInt();
		t2.start();
		
		System.out.println("Hello World");
	}
}
