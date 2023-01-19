import java.util.*;

public class Baej_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int num_list[] = new int[N];

		for (int i = 0; i < N; i++) {

			num_list[i] = in.nextInt();
		
		}

		Arrays.sort(num_list);
		
		System.out.print(num_list[0] + " " + num_list[N-1]);

		in.close();
		
	}

}
