import java.util.*;

public class BaeJ_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		// 입력받을 개수 number, 입력받은 문장을 배열points에 저장하기 위해 선언
		int number = in.nextInt();
		String points[] = new String[number];
		
		// 입력받을 개수만큼 문자열 입력받기
		for(int i=0; i<points.length; i++) {
			
			points[i] = in.next();	
			
		}
		
		// 각 문자열마다 반복문을 통해 계산
		for(int i=0; i<points.length; i++) {
			
			// count = 문자 O가 나올 때마다 카운트 ++
			int count = 0;
			// 총합을 저장하기 위해 total 선언
			int total = 0;
			
			// 각 문자열 속 문자들을 반복문을 통해 확인
			for(int j=0; j<points[i].length(); j++) {
				
				// 문자 O가 나올 시 count 값 증가 
				if(points[i].charAt(j) == 'O') {
					count++;
				// 그 외 문자 (X) 발견시 초기화
				} else {
					count=0;
				}
				
				total += count;
			}
			System.out.println(total);
		}
	}

}
