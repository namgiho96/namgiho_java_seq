package Math;
import java.util.Random;
/*<문제>
영어 시험 성적이 80점 이상인 학생들의 수를 구하는 알고리즘을 제시하라.
- 전체 학생의 수는 100명이다.
- 영어 점수는 100점 만점을 기준으로 채점되었다.
- 영어 점수는 배열 변수 JUMSU(100)에 이미 저장되어 있다고 가정한다.
 * */
public class Count {
	public static void main(String[] args) {
		int [] JUMSU = new int[100];
		Random random  = new Random();
		int count = 0;
		for(int i=0; i<JUMSU.length;i++){// 3번쨰 우너리 
				JUMSU[i] = random.nextInt(101);  
		}
		for(int i = 0;i<JUMSU.length;i++){
			if(JUMSU[i] >= 80){
				count++;
			}
		}	
		System.out.printf("영어 시험 성적이 80점 이상인 학생들의 수,%d",count);	
	}
	
}
