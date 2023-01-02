import java.util.Scanner;

public class BaeJ_9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int point = 0;
		
		Scanner in = new Scanner(System.in);
		
		point = in.nextInt();
		
		if (point >= 90 && point <= 100) {
			System.out.println("A");
		} else if (point >= 80 && point <= 89) {
			System.out.println("B");
		} else if (point >= 70 && point <= 79) {
			System.out.println("C");
		} else if (point >= 60 && point <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
