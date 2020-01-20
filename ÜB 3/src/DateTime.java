// Created by Tom Seibt

public class DateTime {
	Date date;
	Time time;
	
	DateTime(Date date, Time time){
		this.date = date;
		this.time = time;
	}
	
	public boolean isEarlierThan(DateTime that) {
		return (this.date.isEarlierThan(that.date) 
				|| this.date.isSameDate(that.date)
				&& this.time.isEarlierThan(that.time));
	}
	
	public boolean isLaterThan(DateTime that) {
		return (this.date.isLaterThan(that.date) || this.date.isSameDate(that.date)
				&& this.time.isLaterThan(that.time));
	}
	
	public static void main(String[] args) {
		Date d1 = new Date(11,11,2011);
		Date d2 = new Date(11,10,2011);
		Time t1 = new Time(11,11,11);
		Time t2 = new Time(12,12,12);
		DateTime dt1 = new DateTime(d1, t1);
		DateTime dt2 = new DateTime(d2, t2);
		System.out.println(dt1.isEarlierThan(dt2));
		System.out.println(dt2.isEarlierThan(dt1));
	}
}
