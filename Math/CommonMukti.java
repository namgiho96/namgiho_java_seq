package Math;
import java.util.Scanner;
/*�� �� �̻��� �ڿ����� ������ ����� ���Ѵ�
 * ���� ��� 3�� 4�� ������� 3�� ����̱⵵ �ϰ� 4�� ����̱⵵ �� ���̴�
 * �� ���� ����� �߿��� ���� ���� ���� �ּҰ����\
 * Least Common Multi =>LCM
 * ���п���, �������� �����(����, ����: common divisor)�� ���ÿ� �׵� ����� ����� ������.
 *  ��� �ϳ��� 0�� �ƴ� �������� �ִ�����(��������, ��ȭ��: �üӳ�����; ����: greatest common divisor, ���� GCD)�� ����� ��� ���� ū �ϳ���.
 *   ���׽��̳� ȯ�� ���ҿ� ���ؼ��� ������ �� �ִ�.
 * 
 * */
public class CommonMukti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ִ����� ���� �� ���� �Է��ϼ���");
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
		//System.out.println("%d , %d :: �� �ּҰ����::%d & �ִ����� : %d");
			
	}
	
}
