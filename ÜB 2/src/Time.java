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
	
	public String toString() {
		return hour+":"+minute+" Uhr";
	}
	
	public static void main(String[] args) {
		Time t1 = new Time(12,59,15);
		System.out.println(t1.toString());
	}
}
