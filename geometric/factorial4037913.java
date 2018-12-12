package geometric;
/*1 = 1*1
 * 2 = 2*1
 * 3= 3 * 2*1
 *  4*3*2*1
 * */
public class factorial4037913 {
	public static void main(String[] args) {
		int S = 1;
		int F = 1;
		int N = 1;
		
		while(true){
			N++;
			F*=N;
			S+=F;
			if(N<10){
				
			}else{
				break;
			}
		}
		
		System.out.printf("S iws %d",S);
	}
}
