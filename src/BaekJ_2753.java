import java.util.*;

public class BaekJ_2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 0;
		
		Scanner in = new Scanner(System.in);
		
		year = in.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}

}
