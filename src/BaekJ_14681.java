import java.util.*;

public class BaekJ_14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 0;
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		
		if (a > 0 && b > 0 ) {
			System.out.println("1");
		} else if (a <0 && b > 0) {
			System.out.println("2");
		} else if (a < 0 && b < 0) {
			System.out.println("3");
		} else if (a > 0 && b <0 ) {
			System.out.println("4");
		} else {
			System.out.println("Error");
		}
		
	}

}
