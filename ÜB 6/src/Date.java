import static java.lang.Math.floor;

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
	
	public int easter() {
		return 1;
	}
	
	int dayOfWeek(){
	    int y = year;
	    if (month < 3) y = year - 1;
	    int a = (int) floor(2.6 * ((month + 9) % 12 + 1) - 0.2);
	    int b = (int) (floor(y / 400) - 2 * floor(y / 100));
	    int c = (int) (floor(y % 100 / 4) + b - 1);
	    int output =(((day + a + y % 100 + c) % 7 + 7) % 7 + 1);
	    return output;
	  }
	
	public static void main(String[] args) {
		Date d1 = new Date(01,01,2001);
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
		System.out.println(d6.getAbsoluteDaysInYear());
	}
}
