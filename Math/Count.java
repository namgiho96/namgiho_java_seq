package Math;
import java.util.Random;
/*<����>
���� ���� ������ 80�� �̻��� �л����� ���� ���ϴ� �˰����� �����϶�.
- ��ü �л��� ���� 100���̴�.
- ���� ������ 100�� ������ �������� ä���Ǿ���.
- ���� ������ �迭 ���� JUMSU(100)�� �̹� ����Ǿ� �ִٰ� �����Ѵ�.
 * */
public class Count {
	public static void main(String[] args) {
		int [] JUMSU = new int[100];
		Random random  = new Random();
		int count = 0;
		for(int i=0; i<JUMSU.length;i++){// 3���� ��ʸ� 
				JUMSU[i] = random.nextInt(101);  
		}
		for(int i = 0;i<JUMSU.length;i++){
			if(JUMSU[i] >= 80){
				count++;
			}
		}	
		System.out.printf("���� ���� ������ 80�� �̻��� �л����� ��,%d",count);	
	}
	
}
