package geometric;

import javax.swing.SingleSelectionModel;

/*
 * ù° �� ��° ���� 1�̸� �� ���� ��� ���� �ٷ� �� �� ���� ���� �����̴�. 
 * ó�� ���� ���� ���� 1, 1, 2, 3, 5, 8�̴�
 * �Ǻ���ġ ������ 20��° �ױ����� ���� ���ΰ�? 17710
 * 5�ױ����� ���� 12�� ������ ���� ���� ����ô�.
 * */
public class Fibonacci17710 {
	public static void main(String[] args) {
		int A = 1;
		int B = 1;
		int N = 2;
		int C = 0;
		int S = A+B;//���� ����
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
