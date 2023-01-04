import java.util.*;

public class BaekJ_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hour = 0, minute = 0, add = 0;
		int quotient = 0, remainder = 0;
		Scanner in = new Scanner(System.in);
		
		hour = in.nextInt();
		minute = in.nextInt();
		add = in.nextInt();
		
		// 부등호 표시 오답 >(x), >=(o)
		if ((minute + add) >= 60) {
		
			quotient = (minute +add) / 60;
			remainder = (minute + add) % 60;
			
			hour += quotient;
			
			if( hour == 24) {
				hour = 0;
			} else if (hour > 24) {
				hour = hour - 24;
			} 
			
			System.out.println(hour + " " + remainder);
		
		} else {
			
			minute = minute + add;
			
			System.out.println(hour + " " + minute);
		}
	}

}
