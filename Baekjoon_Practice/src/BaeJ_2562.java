import java.util.*;

public class BaeJ_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int num_list[] = new int[9];
		int max = -1;
		for(int i=0; i<9; i++) {
			
			num_list[i] = in.nextInt();
			
			if(max < num_list[i]) {
				max = num_list[i];
			}
		
		}


		for(int i=0; i<9; i++) {
			
			if(num_list[i] == max) {
				System.out.println(max + "\n" + (i+1));
			}
		}
		
	}

}
