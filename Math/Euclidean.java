package Math;
import java.util.*;
public class Euclidean {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("�ִ������� �ּҰ������ ���� �� ���� �Է��ϼ���");
		int num1 = scanner.nextInt(),
			num2 = scanner.nextInt(),
			big = 0,
			small = 0,
			mok = 0,
			nmg = 0,
			lcm = 0,
			gcd = 0;
		
		while(nmg != 0){
			if(nmg < small){
				 mok = nmg;
				 nmg = small;
				 small = mok;
			}
			nmg = nmg % small;
		}
		gcd =  small;
		lcm = (num1 * num2) /gcd;
		System.out.println();
}
}