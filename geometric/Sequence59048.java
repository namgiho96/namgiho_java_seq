package geometric;
/**
 *  ����(����, common ratio)
 * ������: �� ���� �� �� �װ�. ������ ��(����)�� ������ ����
 *  2 + 6 + 18 + 54 = 80
 *  2 + (2*3) + (2*3*3) + (2*3*3*3) 
 */
public class Sequence59048 {
	public static void main(String[] args) {
			int A = 2;// �̴ϼ�
			int R = 3;
			int S = A;
			int N = 2;
			
			while(true){
				N++;
				A *= R;
				S += A;
				if(N==11){
					break;
				}		
			}
					System.out.println(S);
			
	}
}
