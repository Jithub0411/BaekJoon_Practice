import java.util.*;

public class BaeJ_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int num_list[] = new int[9];
		
		// 최대값을 저장하기 위한 임의의 변수 temp 선언
		int temp = -1;
		
		for(int i=0; i<9; i++) {
			
			num_list[i] = in.nextInt();
			
			// 인덱스별로 비교, 다음 수가 저장된 값보다 클 시 새로 temp에 저장
			if(temp < num_list[i]) {
				temp = num_list[i];
			}
		
		}

		// 배열을 반복문으로 처음 인덱스부터 비교
		// 최대값과 같은 값을 가진 
		for(int i=0; i<9; i++) {
			
			// 각 인덱스와 최대값을 비교 같은 수 일시 출력
			if(num_list[i] == temp) {
				
				// 배열 때문에 반복문이 0에서 시작했으므로 몇 번째 수인지를 표시하기 위해 1에서 시작하도록 +1
				System.out.println(temp + "\n" + (i+1));
			}
		}
		
	}

}
