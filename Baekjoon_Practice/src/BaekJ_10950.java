import java.util.*;

public class BaekJ_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
	
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();	
		int [] d = new int[a];
		
		for(int i = 0; i<a; i++) {
			int b = in.nextInt();
			int c = in.nextInt();
			
			d[i] = b + c; 
		}
		
		for(int i= 0; i< d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
