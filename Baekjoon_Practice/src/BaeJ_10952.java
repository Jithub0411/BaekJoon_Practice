import java.util.*;
import java.io.*;

public class BaeJ_10952 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		// BufferedReader 및 BufferedWriter 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// StringTokenizer: String(문자열) Tokenizer(토큰화)
		// StringTokenizer st = new StringTokenizer(문자열): 띄어쓰기 기준
		// StringTokenizer st = new StringTokenizer(문자열,구분자): 구분자 기준
		// StringTokenizer st = new StringTokenizer(문자열,구분자,true/false):
		// true: 구분자도 코튼으로 넣을지
		// false: 구분자는 분리된 문자여 토큰에 포함 안 시킴 (Default)
			
		// StringTokenizer st 선언
		StringTokenizer st;
		
		// 정수형 변수 a와 b 선언
		int a, b;
		 
		// 특수한 입력이 들어오기 전까지 무한 반복
		while(true) {
			
			// 입력 값을 Token화
			st= new StringTokenizer(br.readLine());
			
			// 공백문자로 나누어진 값을 a와b에 저장
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			// a와 b의 값이 모두 0으로 입력받을 때 반복문 종료
			if (a == 0 && b == 0) {
				break;
			} 
			
			// 그 외에는 결과값 출력
			else {
				bw.write(a - b + "\n");
			}
			
		}
		
		// close()와 flush() 차이
		// close(): 1. 먼저 스트림을 flush 2. 스트림 닫기
		// flush(): 스트림 flush
		// 스트림을 닫지 않은 상태에서 flush를 원할 경우 flush() 사용
		
		// BufferedReader 및 BufferedWriter 종료 
		br.close();
		bw.close();
	
	}

}
