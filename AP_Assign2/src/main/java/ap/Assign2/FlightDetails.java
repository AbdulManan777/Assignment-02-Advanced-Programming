package ap.Assign2;

public class FlightDetails {
	
	int ID;
	String date;
	String departure_time;
	int no_of_passenger;
	String from;
	String where_To;
	Reservation r;



FlightDetails() {
	
	ID=0;
	date=null;
	departure_time=null;
	no_of_passenger=0;
	from=null;
	where_To=null;
	
	
}
FlightDetails(int i, String D, String Dt, int n, String f, String w,int fa,String c) {
	
	ID=i;
	date=D;
	departure_time=Dt;
	no_of_passenger=n;
	from=f;
	where_To=w;
	r=new Reservation(fa);
	r=new Reservation(c);
}

public int getID() {
	
	return ID;
}

public String getDate() {
	
	return date;
}
public String getDepartureTime() {
	
	return departure_time;
}

public int getPassenger() {
	
	return no_of_passenger;

}

public String getSource() {
	
	return from;
}

public String getDestination() {
	
	return where_To;
}

public int getFare() {
	
	return r.getfare();
}

public String getClass1() {
	
	return r.getplaneType();
}

public int SeeFare(String C) throws PlaneClassException {
	
       if(C.equals("Economy"))
    	   return 8000;
       else if(C.equals("Buissness"))
           return 12000;
           else if(C.equals("First"))
            return 11000;
           else
        	   throw new PlaneClassException("Wrong Class Input");
}

}