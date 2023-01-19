import java.util.*;

public class BaeJ_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int x = in.nextInt();
		
		int num_list[] = new int[n]; 
		
		int numbers;
		
		for (int i=0; i<n; i++) {
			
			numbers = in.nextInt();
			
			num_list[i] = numbers;
		}
		
		for(int i=0; i<num_list.length; i++) {
			
			if (num_list[i] < x) {
				System.out.print(num_list[i] + " ");
			}
		}
		
		in.close();
			
	}

}
