package ap.Assign2;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class DriverClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Passenger p=new Passenger("Ali","Male",24,"F-8/2 Islamabad","B-25431");
		
		FlightDetails FD=new FlightDetails(123,"23-05-2021","7:00 PM",30,"Lahore", "Karachi",8000,"Economy");
		//FileOutputStream fo=new FileOutputStream("E:\\Data.txt");
		String s1=Integer.toString(FD.getID())+" "+FD.getDate()+" "+FD.getDepartureTime()+" "+Integer.toString(FD.getPassenger())+" "+FD.getSource()+" "+FD.getDestination()+" "+Integer.toString(FD.getFare())+FD.getClass1();
		//byte [] arr=s1.getBytes();
		//fo.write(arr);
		
		
		FlightDetails FD2=new FlightDetails(124,"24-05-2021","8:00 PM",26,"Islamabad", "Karachi",12000,"Buissness");
		
		String s2=Integer.toString(FD2.getID())+" "+FD2.getDate()+" "+FD2.getDepartureTime()+" "+Integer.toString(FD2.getPassenger())+" "+FD2.getSource()+" "+FD2.getDestination()+" "+Integer.toString(FD2.getFare())+FD2.getClass1();
		//byte [] arr2=s2.getBytes();
		//fo.write(arr2);
		
		
        FlightDetails FD3=new FlightDetails(125,"24-05-2021","9:00 PM",27,"Islamabad", "Karachi",11000,"first");
		
		String s3=Integer.toString(FD3.getID())+" "+FD3.getDate()+" "+FD3.getDepartureTime()+" "+Integer.toString(FD3.getPassenger())+" "+FD3.getSource()+" "+FD3.getDestination()+" "+Integer.toString(FD3.getFare())+FD3.getClass1();
		//byte [] arr3=s3.getBytes();
		//fo.write(arr3);
		//fo.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
				"E:\\Data.txt"), true));
		bw.write(s1);
		bw.newLine();
		bw.write(s2);
		bw.close();
		int choice;
		System.out.println("What you want to check");
		System.out.println("Press 1 to check for a flight on a particular Date");
		System.out.println("Press 2 to check for fare");
		System.out.println("Press 3 to book flight");
		Scanner sc1= new Scanner(System.in);
		choice=sc1.nextInt();
	
		if(choice==1) {
		
			Flightavailable fb=new Flightavailable();
			try {
			fb.CheckAvailable();
			}
			catch(DateException e) {
				
				System.out.println("Catch the Excpetion"+e);
			}
		
	}
		else if(choice==2) {
			
			Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
			
			System.out.print("Enter a class for which you want to see fare (Economy/First/Buissness ");  
			String a = sc.next();
			FlightDetails f=new FlightDetails();
			
			
			try {
				
				int fa=f.SeeFare(a);
				System.out.println("Fare of this class plane="+fa);
				
			}
			catch(PlaneClassException e) {
				
				System.out.println("Catch the Excpetion"+e);
				
			}
			
			
		}
		
		
            else if(choice==3) {
			
			
            	Reservation R=new Reservation();
			
			
			try {
				
				
				
				int code=R.BookFlight();
				System.out.println("Your Reference Code is"+code);
			}
			catch(BookingException e) {
				
				System.out.println("Catch the Excpetion"+e);
				
			}
			
			
		}
		
	}

}
