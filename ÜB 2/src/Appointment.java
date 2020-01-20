// Created by Tom Seibt

public class Appointment {
	DateTime time;
	int length;
	String reason;
	String place;
	
	Appointment(DateTime t, int l, String r, String p){
		this.time = t;
		this.length = l;
		this.reason = r;
		this.place = p;
	}
	
	public String toString(){
		return time.toString();
	}
	
	public static void main(String[] args){
		Date d3 = new Date(29,11,2018);
		Time t3 = new Time(12,59,15);
		DateTime dt2 = new DateTime(d3, t3);
		Appointment a1 = new Appointment(dt2, 40, "Arzt", "Park");
		System.out.println(a1.toString());
	}
}
