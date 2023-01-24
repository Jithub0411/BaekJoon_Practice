import java.util.Scanner;
public class BaeJ_1712 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // a = 고정비용, b = 가변 비용
        int a,b;
        // c = 가격
        int c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        // 이익이 발생하지 않을 시
       if (c <= b) {
           System.out.println("-1");
       }
       // 손익분기점 계산
       else {
           System.out.println(a/(c-b)+1);
       }

    }
}
