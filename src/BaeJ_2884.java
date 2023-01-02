import java.util.*;

public class BaeJ_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h = 0, m = 0;
		
		Scanner in = new Scanner(System.in);
		
		h = in.nextInt();
		m = in.nextInt();
		
		if (m < 45) {
			h--;
			m = 60 - (45 - m);
			
			if(h<0) {
				h = 23;
			}
			
			System.out.println(h + " " + m);
		}
		
		else {
			System.out.println(h + " " + (m-45));
		}
		
		
	}

}
