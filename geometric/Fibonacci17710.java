package geometric;

import javax.swing.SingleSelectionModel;

/*
 * 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열이다. 
 * 처음 여섯 항은 각각 1, 1, 2, 3, 5, 8이다
 * 피보나치 수열의 20번째 항까지의 합은 얼마인가? 17710
 * 5항까지의 합이 12가 나오는 식을 먼저 만듭시다.
 * */
public class Fibonacci17710 {
	public static void main(String[] args) {
		int A = 1;
		int B = 1;
		int N = 2;
		int C = 0;
		int S = A+B;//미정 정답
		while(true){
			N++;
			C = A+B;
			System.out.println(C);
			A = B;
			B = C;
		
			
			
			if(N>19){
				break;
			}
		}
		System.out.println(S);
		
	}
}
