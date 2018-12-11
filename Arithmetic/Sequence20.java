package Arithmetic;
/** 
 * 등차 수열은 두 항의 차이는 이 수열
 * 공차 : 공통적으로 나타나는 차이
 *2
 * **/

public class Sequence20 {
	public static void main(String[] args) {
		int i = 0, d = 1, sum = 1;
		while(true){
			i++;
			d +=i;
			sum += d;
		if(i < 19){
			continue;
		}else{
			break;
		}
		
		}
		System.out.print(sum);
			
			
		}
		
		
	}

/*System.out.printf(
"======================================================\n"
+ "1+2+4+7+11+16+22+... 증가하는 수열의 20번째 항까지 합 \n"
+ "======================================================\n"
+ "%d \n"
+ "=======================================================",sum);*/