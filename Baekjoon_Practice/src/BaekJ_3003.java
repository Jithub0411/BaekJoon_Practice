import java.util.*;

public class BaekJ_3003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k,q,l,b,n,p;
		int k2, q2, l2, b2, n2, p2;
		
		Scanner in = new Scanner(System.in);
		
		k = in.nextInt();
		q = in.nextInt();
		l = in.nextInt();
		b = in.nextInt();
		n = in.nextInt();
		p = in.nextInt();
		
		//System.out.printf("%s %s %s %s %s %s \n", k, q, l, b, n, p);
		
		k2 = 1 - k;
		q2 = 1 - q;
		l2 = 2 - l;
		b2 = 2 - b;
		n2 = 2 - n;
		p2 = 8 - p;
		
		System.out.printf("%s %s %s %s %s %s", k2, q2, l2, b2, n2, p2);
	}

}
