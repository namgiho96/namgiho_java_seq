package geometric;
/**
 *  공비(共比, common ratio)
 * 등비수열: 각 항이 그 앞 항과. 일정한 비(곱셈)를 가지는 수열
 *  2 + 6 + 18 + 54 = 80
 *  2 + (2*3) + (2*3*3) + (2*3*3*3) 
 */
public class Sequence59048 {
	public static void main(String[] args) {
			int A = 2;// 이니셜
			int R = 3;
			int S = A;
			int N = 2;
			
			while(true){
				N++;
				A *= R;
				S += A;
				if(N==11){
					break;
				}		
			}
					System.out.println(S);
			
	}
}
