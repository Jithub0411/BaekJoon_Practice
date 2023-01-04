import java.util.*;

public class BaeJ_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 0, c = 0;
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		int p1 = (a+b)%c;
		int p2 = ((a%c) + (b%c))%c;
		int p3 = (a*b)%c;
		int p4 = ((a%c) * (b%c))%c;
		
		System.out.printf("%d %d %d %d", p1, p2, p3, p4);
	}

}
