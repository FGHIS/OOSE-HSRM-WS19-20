// Created by Tom Seibt

public class Appointment {
	DateTime time;
	int length;
	String reason;
	String place;
	
	Appointment(DateTime dt, int l, String r, String p){
		this.time = dt;
		this.length = l;
		this.reason = r;
		this.place = p;
	}
	
	public DateTime endingTime() {
		Time t1 = time.time.minutesLater(length);
		Time t2 = new Time(t1.hour, t1.minute, t1.second);
		int hours = (length + this.time.time.minute) / 60;
		int days = (this.time.time.hour + hours) / 24;
		Date d1 = new Date(this.time.date.day + days, 
				this.time.date.month, this.time.date.year);
		DateTime dt1 = new DateTime(d1, t2);
		return dt1;
	}
}