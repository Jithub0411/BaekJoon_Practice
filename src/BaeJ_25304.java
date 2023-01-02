/**
 * 
 * @author: Jihoon Han
 * @Date: 2023.1.12
 * @프로그램 설명: 영수증 맞추기 문제
 * @오답원인: 마지막 총가격과 영수증표를 비교할 때 Yes를 yes로 입력해 오류
 */

import java.util.*;
public class BaeJ_25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// q = 수량(Quantity), Total = 총 가격
		int q = 0, total = 0;
		
		int [] num = new int[100];
		int [] price = new int [100];
		int calculate = 0;
		
		Scanner in = new Scanner(System.in);
		
		//System.out.println("총 금액?");
		total = in.nextInt();
		
		//System.out.println("물건 개수?");
		q = in.nextInt();
		
		for(int i=0; i<q; i++) {			
			
			//System.out.println("물건" + (i+1) + "의  값: " );
			price[i] = in.nextInt();
			
			//System.out.println("물건" + (i+1) + "의 개수: " );
			num[i] = in.nextInt();
			
			calculate += price[i]*num[i];
		}
		
		if (total == calculate) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
