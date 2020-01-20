// Created by Tom Seibt

public class Time {
	int hour;
	int minute;
	int second;
	
	Time(int h, int m, int s){
		this.hour = h;
		this.minute = m;
		this.second = s;
	}
	
	public boolean isEarlierThan(Time that) {
		return (this.hour < that.hour || this.hour == that.hour
				&& this.minute < that.minute || this.hour == that.hour
				&& this.minute == that.minute && this.second < that.second);
	}
	
	public boolean isLaterThan(Time that) {
		return (this.hour > that.hour || this.hour == that.hour
				&& this.minute > that.minute || this.hour == that.hour
				&& this.minute == that.minute && this.second > that.second);
	}
	
	public Time minutesLater(int min) {
		int plusHours = (this.minute + min) / 60;
		int newHour = (this.hour + plusHours) % 24;
		int newMinute = (this.minute + min) % 60;
		Time t1 = new Time(newHour, newMinute, this.second);
		return t1;
	}
	
	public String toString() {
		return this.hour + "." + this.minute + "."
				+ this.second;
	}
	
	public static void main(String[] args) {
		Time t2 = new Time(23,55,11);
		System.out.println(t2.minutesLater(50).toString());
	}
}
