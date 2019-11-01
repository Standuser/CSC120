import java.util.*;
public class Clock {
	private int combinedValue;
	private int THE_SIGN;
	private int combinedValue2, combinedValue3;
	public Clock( int sign, int day, int hour, int minute ) {
		if (sign > 0) {
			THE_SIGN = +1;
		}
		else if (sign < 0){
			THE_SIGN = -1;
		} else {
			THE_SIGN = 0;
		}
		combinedValue = (Math.abs(minute) + Math.abs(hour) * 60 + Math.abs(day) * 60 * 24) * THE_SIGN;
	}
	
	public Clock( int value ) {
		combinedValue = Math.abs(value) ;
		if (value > 0 ) {
			THE_SIGN = 1;
		} 
		else if (value  < 0){
			THE_SIGN = -1;
		} else {
			THE_SIGN = 0;
		}
	}
	
	public int getSign () {
		return THE_SIGN;
	}
	
	public int getDay() {
		/*
		conmbinedValue = 5000 minutes;
	    1 day = 24 * 60 = 1440 minute in 1 day
	    5000 / 1440 = 3.45644
	    (int) 5000/ 1440 = 3
	    */
		int getDay;
		getDay = (int) combinedValue / 1440;
		combinedValue2 = combinedValue - 1440* getDay;
		return getDay;
	}
	
	public int getHour() {
		int getHour = (int) combinedValue2 / 60;
		combinedValue3 = combinedValue2 - 60* getHour;
		return getHour;
	}
	
	public int getMinute() {
		int getMinute = combinedValue3;
		return getMinute;
	}
	
	public int getCombinedValue () {
		return combinedValue;
	}
	
	public int compareTo( Clock o ) {
		int difference = this.combinedValue - o.getCombinedValue();
		return difference;
		
	}
	
	public Clock plus( Clock o ) {
		int plus = combinedValue + o.getCombinedValue();
		Clock returnClock = new Clock(plus);
		return returnClock;
	}
	
	public Clock minus( Clock o ) {
		int minus = combinedValue-o.getCombinedValue();
		Clock returnClock =new Clock(minus);
		return returnClock;
	}
	
	public String toString() {
		String clock = "";
		if ( THE_SIGN == 1) {
			clock += "+";
		} else if (THE_SIGN == -1) {
			clock += "-";
		}
		
		clock += getDay() +" Days, "+ getHour()+ " Hours, "+ getMinute() + " Minutes. ";
				
		return clock;
	}
	

}
