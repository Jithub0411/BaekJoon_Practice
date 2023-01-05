/**
 * 백준 11022번
 * 이름: 한지훈
 * 메모: 반복문과 배열 사용시 배열의 크기에 신경쓰기
 * Ex: ArrayIndexOutOfBoundsException
 */

import java.util.*;

public class BaeJ_11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 스캐너 선언
		Scanner in = new Scanner(System.in);
		
		// 테스트 케이스의 개수 입력 받기
		int n = in.nextInt();
		
		// 배열 a = 각 케이스 A, b = 각 케이스 B, total = A+B
		int [] total = new int[n];
		int [] a = new int[n];
		int [] b = new int[n];
		
		// 입력값만큼 반복
		for(int i=0; i<n; i++) {
			
			// A와 B의 값 받기
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			
			// 배열 total에 저장
			total[i] = a[i] + b[i];			
		}
		
		// 배열 total 길이만큼 반복
		for(int i=0; i<total.length; i++) {
			
			// 결과값 출력
			System.out.println
			("Case #" + (i+1) + ": " + a[i] + " + " + b[i] + " = " + total[i]);
		}
	
	}

}
