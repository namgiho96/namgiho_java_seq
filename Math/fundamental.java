package Math;
import java.util.*;
/* 합성수를 소수의 곱으로 나타내는 방법을 말한다.
 * 소인수분해를 일의적으로 결정하는 방법은 아직 발견되지 않았다. 현대 암호 처리에서 소인수분해의 어려움은 중요한 기준이 된다.
 * 20=2×2×5
 * */
public class fundamental {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소인수 분해할 수를 입력하세요");
		int target = scanner.nextInt();
		int count = 0, mok = 0,nmg = 0,jetsu =2;
		int[] res = new int[count];// 동적(다이나믹)으로 생성함//정적 스태틱
		
		if(target <2){
			return; //벨류 데이션 = 유효성체크
		}
		for(int i=2; i<jetsu; i++){
			// jetsu 가 소수인지 판별
			//if(i%target==1){
				
			}if(target %jetsu ==0){
				
			}else{
				jetsu++;
			}
			
		}
		
	
			
		}
			
		
		
		
	}
  
