import java.util.*;
public class BaeJ_10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		// 갯수 입력 받기
		int num = in.nextInt();
		
		// 입력받은 숫자 저장하는 배열
		int numbers[] = new int[num]; 
		
		// 입력값
		int a;
		
		// 정수 v 및 v의 갯수 변수 total 선언
		int v, total=0;
		
		for(int i=0; i<num; i++) {
			
			a = in.nextInt();
			
			numbers[i] = a;
		}
		
		v = in.nextInt();
		
		for(int i=0; i<num; i++) {
			if(numbers[i] == v) {
				total++;
			}
		}
		
		System.out.println(total);
		
	}

}
