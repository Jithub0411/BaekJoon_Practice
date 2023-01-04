import java.util.*;

public class BaekJ_1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 0, b=0;
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}
		
	}

}
