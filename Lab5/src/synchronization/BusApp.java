package synchronization;

public class BusApp {
	 
	 public static void main(String args[]){
     Totalearnings te=new Totalearnings();
     te.start();
   System.out.println("Total earnings:" +te.total+"rs");
}}


class Totalearnings extends Thread{
       int total=0;


     public void run()
     {
        for(int i=1; i<=10; i++)
         {
               total=total+100;
         }
     }
}
     
