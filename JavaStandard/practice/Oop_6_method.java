class Time {

	private int hour;

	Time(int hour) {
		setHour(hour);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		
		this.hour = hour;
	}

}

public class Oop_6_method {

	public static void main(String[] args) {
		Time t = new Time(3);
		
		// System.out.println(t.hour);  //실행되지 않는다 private로 지정된 변수이므로
		System.out.println(t.getHour()); // hour 값을 읽을 수 있다.

	}

}