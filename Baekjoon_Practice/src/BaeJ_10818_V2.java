import java.util.*;

public class BaeJ_10818_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int num_list[] = new int[N];
		
		// 최대값과 최소값을 찾기 위한 변수 max min 선언
		int max = 1000000, min = -1000000;
		
		// 2번째 방법은 최대값과 최소값을 계산하기 위해 변수 max와 min을 선언
		// 그 후, 입력이 들어올 떄마다 하나씩 비교
		// Ex: 10 20 30 40 50
		// 1) max = 10, min = 10
		// 2) max와 min = 10일 때, 20: max = 20, min = 10
		// 3) max = 20, min = 10일 때 30 : max = 30, min = 10
		// 이 과정을 반복하면 각 max와 min 변수에 배열에서 최대값과 최소값 저장 가능
		
		for(int i=0; i<N; i++) {
			
			num_list[i] = in.nextInt();
			
			if(max > num_list[i]) {
				max = num_list[i];
			}
			
			if(min < num_list[i]) {
				min = num_list[i];
			}
		
		}
		
		System.out.println(max + " " + min);
		
	}

}
