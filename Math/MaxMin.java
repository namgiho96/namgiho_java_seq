package Math;
import java.util.Random;
/*
 * 3개 반의 학생의 몸무게를 측정하였다.
 * 각 반의 학생의 수는 30명이다
 * 각 반의 학생 몸무게의 최대, 최소값을 구하시오
 * 단, 몸무게는 40~100사이에서 랜덤으로 생성시키시오
 * */
public class MaxMin {
	public static void main(String[] args) {
		Random random = new Random();
		int[] ban = new int[30];
		int max =40, min = 100;
		
		for(int i=0;i<ban.length;i++){
		ban[i] = random.nextInt(61)+40;
		if(max>=ban[i]){
			max =ban[i];
		}if(ban[i]<=min){
			min =ban[i];
		}
			
		
		
			
		}
			
		System.out.printf("최대값은,%d,최소값은 %d",max,min);	
		}
	}

