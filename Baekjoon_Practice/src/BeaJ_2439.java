import java.util.*;

public class BeaJ_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		// 줄 및 별 개수 입력받기 
		int n = in.nextInt();
		
		// 반복문 i = 줄 바꿈
		for(int i=1; i<=n; i++) {
			
			// 반복문 j = 공백 출력
			for(int j=1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			// 반복문 k = 별 출력
			for(int k=0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		in.close();
	}

}
