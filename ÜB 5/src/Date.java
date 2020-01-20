// Created by Tom Seibt

public class Date {
	int day;
	int month;
	int year;
	
	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean isLaterThan(Date that) {
		return (this.year > that.year || this.year == that.year 
				&& this.month > that.month || this.year == that.year 
				&& this.month == that.month && this.day > that.day);
	}
	
	public boolean isEarlierThan(Date that) {
		return (this.year < that.year || this.year == that.year 
				&& this.month < that.month || this.year == that.year 
				&& this.month == that.month && this.day < that.day);
	}
	
	public boolean isSameDate(Date that) {
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

	public String toString(){
		return day+"."+month+"."+year;
	}
	
	Date easter() {
		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int f = (b+8) / 25;
		int g = (b-f+1) / 3;
		int h = (19*a + b - d - g + 15) % 30;
		int i = c / 4;
		int k = c % 4;
		int l = (32 + 2*e + 2*i - h -k) % 7;
		int m = (a + 11*h + 22*l) / 451;
		int n = (h+l-7*m+114)/31;
		int p = (h+l-7*m+114)%31;
		Date easter = new Date(p+1,n,this.year);
		return easter;
	}
	
	public static void main(String[] args) {
		/*Date d1 = new Date(01,01,2001);
		System.out.println(d1.dayOfWeek());
		Date d2 = new Date(02,01,2001);
		Date d3 = new Date(01,02,2001);
		Date d4 = new Date(01,01,2001);
		Date d5 = new Date(01,01,1700);
		Date d6 = new Date(01,01,2000);
		System.out.println(d1.isLaterThan(d2));
		System.out.println(d2.isLaterThan(d3));
		System.out.println(d1.isSameDate(d2));
		System.out.println(d1.isSameDate(d4));
		System.out.println(d5.isLeapYear());
		System.out.println(d6.isLeapYear());
		System.out.println(d5.getAbsoluteDaysInYear());
		System.out.println(d6.getAbsoluteDaysInYear());*/
		Date dd = new Date(22,02,1999);
		System.out.println(dd.easter().toString());	
	}
}

