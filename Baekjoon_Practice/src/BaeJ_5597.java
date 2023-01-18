import java.util.*;

public class BaeJ_5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		// check = 입력값
		int check;
		int number = 31;
		int students[] = new int[number];

		for(int i=0; i<28; i++) {
			
			check = in.nextInt();
			
			students[check] = 1;
		}
		
		for(int i=1; i<students.length; i++) {
			
			if(students[i] != 1) {
				System.out.print(i + " ");
			}
		}

	}

}
