// Created by Tom Seibt

public class Date2 {
	int day;
	int month;
	int year;
	
	Date2(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean isLaterThan(Date2 that) {
		return (this.year > that.year || this.year == that.year 
				&& this.month > that.month || this.year == that.year 
				&& this.month == that.month && this.day > that.day);
	}
	
	public boolean isEarlierThan(Date2 that) {
		return (this.year < that.year || this.year == that.year 
				&& this.month < that.month || this.year == that.year 
				&& this.month == that.month && this.day < that.day);
	}
	
	public boolean isSameDate(Date2 that) {
		return !(this.isEarlierThan(that)) && !(this.isLaterThan(that));
	}
	
	public boolean isLeapYear() {
		return((this.year % 4 == 0) && (!(this.year % 100 == 0) 
				|| (this.year % 400 == 0)));
	}
	
	public int getAbsoluteDaysInYear() {
		int output = 0;
		if (this.isLeapYear()) {
			output = 366;
		} else {
			output = 365;
		}
		return output;
	}
	
	int dayOfWeek() {
		int y = (month < 3) ? (year - 1) : year;
	  return (day + (26 * ((month + 9) % 12 + 1)
		- 2) / 10 + y % 100 + (y % 100
				/ 4) + (y / 400) - 2 * (y / 100) - 1) % 7 +1;
	}

	
	public static void main(String[] args) {
		Date2 d1 = new Date2(01,01,2001);
		System.out.println(d1.dayOfWeek());
		Date2 d2 = new Date2(02,01,2001);
		Date2 d3 = new Date2(01,02,2001);
		Date2 d4 = new Date2(01,01,2001);
		Date2 d5 = new Date2(01,01,1700);
		Date2 d6 = new Date2(01,01,2000);
		System.out.println(d1.isLaterThan(d2));
		System.out.println(d2.isLaterThan(d3));
		System.out.println(d1.isSameDate(d2));
		System.out.println(d1.isSameDate(d4));
		System.out.println(d5.isLeapYear());
		System.out.println(d6.isLeapYear());
		System.out.println(d5.getAbsoluteDaysInYear());
		System.out.println(d6.getAbsoluteDaysInYear());
	}
}

