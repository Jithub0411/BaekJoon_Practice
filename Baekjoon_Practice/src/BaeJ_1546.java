import java.util.Scanner;
import java.util.Arrays;

public class BaeJ_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		// numbers = 과목 점수 개수, points = 점수를 저장할 배열, largest = 가장 높은 점수, cal = 평균 계산
		int numbers = in.nextInt();
		double points[] = new double[numbers];
		int largest = 0;
		double cal = 0;
		
		// 현재 점수 입력 받아 저장
		for (int i = 0; i < numbers; i++) {

			points[i] = in.nextInt();
		}

		// 가장 큰 점수 계산을 위해 정렬
		Arrays.sort(points);

		// 마지막 인덱스 = 가장 높은 점수
		largest = (int) points[numbers - 1];

		// 과목 점수별로 새로 계산 후 cal에 점수 합치기
		for (int i = 0; i < numbers; i++) {

			points[i] = points[i] / largest * 100;
			
			cal += points[i];
		}

		// 새로운 점수들의 평균 값 구하기
		cal = (cal/numbers);
		
		System.out.println(cal);
	}

}
