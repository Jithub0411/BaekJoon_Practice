import java.util.*;

public class BaeJ_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		// 5줄 생성
		for(int i=1; i<=num; i++) {
			// i만큼 별 개수 출력
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 스캐너 종료
		in.close();
	}	
}
