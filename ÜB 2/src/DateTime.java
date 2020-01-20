// Created by Tom Seibt

public class DateTime {
	Date date;
	Time time;
	
	DateTime(Date d, Time t){
		this.date = d;
		this.time = t;
	}
	
	public String toString() {
		return date.toString() + time.toString();
	}
	
	public static void main(String[] args) {
		Date d2 = new Date(29,11,2018);
		Time t2 = new Time(12,59,15);
		DateTime dt1 = new DateTime(d2, t2);
		System.out.println(dt1.toString());
	}
}
