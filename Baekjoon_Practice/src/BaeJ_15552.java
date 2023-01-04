/**
 * 문제 15552번: 빠른 A+b
 * 이름: 한지훈
 * 중요: Scanner와 System.out.println 대신 
 * 		BufferReader와 BufferWriter를 사용
 * 		StringTokenizer 사용
 */
import java.io.*;
import java.util.StringTokenizer;

public class BaeJ_15552 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// BufferedReader 및 BufferedWriter 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 형 변환 (숫자형 문자열 String -> Integer)
		// readLine() : 1. 리턴값이 String으로 고정 = 형변환 고정
		// 				2. 예외처리 해줘야 함 (try & catch 활용)
		//					ex: throws IOException
		int num = Integer.parseInt(br.readLine());
		
		// StringTokenizer: String(문자열) Tokenizer(토큰화)
		// StringTokenizer st = new StringTokenizer(문자열): 띄어쓰기 기준
		// StringTokenizer st = new StringTokenizer(문자열,구분자): 구분자 기준
		// StringTokenizer st = new StringTokenizer(문자열,구분자,true/false):
		// true: 구분자도 코튼으로 넣을지
		// false: 구분자는 분리된 문자여 토큰에 포함 안 시킴 (Default)
	
		// StringTokenizer st 선언
		StringTokenizer st;
	
		// 정수형 변수 a와 b 선언
		int a,b;
		
		// 입력한 숫자만큼 반복
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			bw.write(a + b + "\n");
			
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
