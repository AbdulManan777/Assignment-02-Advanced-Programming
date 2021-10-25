package ap.Assign2;

import java.util.Scanner;

public class Reservation {
	
	int id;
	String title;
	int ticket_no;
	int seat_no;
	String plane_type;
    int fare;
    
    Reservation(){
    	
    	id=0;
    	title=null;
    	ticket_no=0;
    	seat_no=0;
    	plane_type=null;
    	fare=0;
    }

    Reservation(int f){
    	
    	fare=f;
    }

    
 Reservation(String cl){
    	
    	plane_type=cl;
    }
Reservation(int i,String ti, int t, int s,String p,int f){
	
	id=i;
	title=ti;
	ticket_no=t;
	seat_no=s;
	plane_type=p;
	fare=f;
}


public int getfare() {
	
	return fare;
}

public String getplaneType() {
	
	return plane_type;
}

public int BookFlight() throws BookingException {
	
	Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	int code=981232;
	System.out.println("Press any key to Start booking Process");  
	int a=sc.nextInt();
	
	
	   if(a==1) {
		
		Scanner sc1= new Scanner(System.in); //System.in is a standard input stream  
		
		System.out.println("Which Plane class you want choose");
		System.out.println("Press 2 For Economy class");  
		System.out.println("Press 3 For Buissness class");
		System.out.println("Press 4 For First class");
		
		int c=sc1.nextInt();
		if(c==2) {
			
			          System.out.println("Fare for Economy class is 8000");
			          System.out.println("Enter the Payment amount for this class");
			          int p=sc1.nextInt();
			          if(p==8000) {
			          
			        	      System.out.println("Payment Collected Successfully");
			        	      return code;
			          }
			          else if(p<8000)
			        	  throw new BookingException("Payment is not full");
		}
		
		else if(c==3) {
			
	          System.out.println("Fare for Buissness class is 12000");
	          System.out.println("Enter amount for this palne class");
	          int p=sc1.nextInt();
	          if(p==12000) {
	          
	        	      System.out.println("Payment Collected Successfully");
	        	      return code;
	          }
	          else if(p<12000)
	        	  throw new BookingException("Payment is not full");
         }
		
		
		else if(c==4) {
			
	          System.out.println("Fare for First class is 11000");
	          System.out.println("Enter amount for this palne class of fare");
	          int p=sc1.nextInt();
	          if(p==11000) {
	          
	        	      System.out.println("Payment Collected Successfully Thanks");
	        	      
	          }
	          else if(p<11000)
	        	  throw new BookingException("Payment is not full");
       }
		
	   }
	   else {
		   
		   System.out.println("Not a valid Input");
		   
	   }
	   return code;
}
}
