/**
 * 백준 11021번
 * 이름: 한지훈
 * 메모: 반복문과 배열 사용시 배열의 크기에 신경쓰기
 * Ex: ArrayIndexOutOfBoundsException
 */

import java.util.*;

public class BaeJ_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 스캐너 선언
		Scanner in = new Scanner(System.in);
		
		// 테스트 케이스의 개수 입력 받기
		int n = in.nextInt();
		
		// 변수 값: A,B / A+B 결과값 
		int a, b;
		
		// 결과값 저장을 위한 배열 total 선언
		int [] total = new int[n];
		
		// 입력값만큼 반복
		for(int i=0; i<n; i++) {
			
			// A와 B의 값 받기
			a = in.nextInt();
			b = in.nextInt();
			
			// 배열 total에 저장
			total[i] = a+b;			
		}
		
		// 배열 total 길이만큼 반복
		for(int i=0; i<total.length; i++) {
			System.out.println("Case #" + (i+1) + ": " + total[i]);
		}
	
	}

}
