package synchronization;
public class Busappsol {
	  public static void main(String args[]) throws InterruptedException{
	     Totalearning te=new Totalearning();
	     te.start();
	  
	   synchronized(te)
	   {   
		   System.out.println("Total earnings:" +te.total+"rs");
		   te.wait(1200);
		   System.out.println("Total earnings:" +te.total+"rs");
	   }
	}}
