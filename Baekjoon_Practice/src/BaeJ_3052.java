import java.util.*;

public class BaeJ_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		// 중복제거를 위해 HashSet 사용
		HashSet<Integer> h = new HashSet<Integer>();
		
		int num;
		
		// 42로 나눈 나머지 값을 HashSet에 저장
		for(int i=0; i<10; i++) {
			
			num = (in.nextInt() % 42);
			h.add(num);
		}
		
		in.close();
		// HashSet의 크기 = 서로 다른 값의 수
		System.out.println(h.size());
	}

}
