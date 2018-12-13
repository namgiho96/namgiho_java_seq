package Math;
import java.util.Scanner;
/*두 개 이상의 자연수의 공통인 배수를 말한다
 * 예를 들어 3과 4의 공배수는 3의 배수이기도 하고 4의 배수이기도 한 수이다
 * 두 수의 공배수 중에서 가장 작은 수를 최소공배수\
 * Least Common Multi =>LCM
 * 수론에서, 정수들의 공약수(公約數, 영어: common divisor)는 동시에 그들 모두의 약수인 정수다.
 *  적어도 하나가 0이 아닌 정수들의 최대공약수(最大公約數, 문화어: 련속나눔셈; 영어: greatest common divisor, 약자 GCD)는 공약수 가운데 가장 큰 하나다.
 *   다항식이나 환의 원소에 대해서도 정의할 수 있다.
 * 
 * */
public class CommonMukti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("최대공약수 구할 두 수를 입력하세요");
		int num1 = 12,
		num2 = 18, 
		lcm =0,
		gcd =0;
		for(int i =0; i<num1;i++){	
			if(num1%(i+1)==0&&num2%(i+1)==0){
			 lcm = i+1;
		}else{
			
		}
		}
		System.out.println("lcm :"+lcm);
		//System.out.println("%d , %d :: 의 최소공배수::%d & 최대공약수 : %d");
			
	}
	
}
