package Math;
import java.util.Random;
/*
 * 3�� ���� �л��� �����Ը� �����Ͽ���.
 * �� ���� �л��� ���� 30���̴�
 * �� ���� �л� �������� �ִ�, �ּҰ��� ���Ͻÿ�
 * ��, �����Դ� 40~100���̿��� �������� ������Ű�ÿ�
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
			
		System.out.printf("�ִ밪��,%d,�ּҰ��� %d",max,min);	
		}
	}

