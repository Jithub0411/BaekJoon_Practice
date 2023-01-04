import java.util.*;

public class BaekJ_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 0;
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		
		int b1 = (b % 10);
		int b2 = ((b % 100) -b1) / 10;
		int b3 = (b - b2 - b1) / 100 ;
		
		System.out.println(a * b1);
		System.out.println(a * b2);
		System.out.println(a * b3);
		System.out.println(a * b);
		
	}

}
