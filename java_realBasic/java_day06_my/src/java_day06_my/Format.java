package java_day06_my;

public class Format {
	public static void main(String[] args) {
		String msg = "안녕 오늘은 %d 일이야";
		int day =1;
		String.format(msg, day);
		System.out.println(String.format(msg, day));
	}
}
