import java.util.*;

public class BaeJ_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 0, b=0, c=0;
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		if(a == b && a == c && b == c) {
			System.out.println(10000 + a * 1000);
		}
		
		else if (a == b || a == c || b==c) {
			
			if ( a == b) {
				System.out.println(1000 + a * 100);
			}
			else if (a == c) {
				System.out.println(1000 + a * 100);
			}
			
			else {
				System.out.println(1000 + c * 100);
			}
			
		}
		
		else {
			if (a > b && a > c) {
				System.out.println(a * 100);
			}
			else if (b > a && b >c) {
				System.out.println(b * 100);
			}
			else {
				System.out.println(c * 100);
			}
			
		}
	}

}
