package Arithmetic;
/**
��������: �����ϴ� �� ���� ���̰� ��� ������ ����
����(common difference) : ���������� ��Ÿ���� ����
2+8+14+20+26=70
 * */
public class Sequence5 {
	public static void main(String[] args) {
		int A = 2; // ���� 2
        int S = A;
        int D = 6; // ����
        int N = 2; // ��°
        int AN = 0;
        // 2 + 8 + 14 + 20
        // 2 + (2+6) + (2+6+6)+ (2+6+6+6)
        String ex = "2";
        while(true){
        	AN++;
        	S += A+AN*D;
        	N += D;
        	ex += "+"+N;
        	if(AN<4){
        		continue;	
        	}else{
        		break;
        	}
        	
        	//�̰��� ä��ÿ�
        }
     
      System.out.println(ex + "=" + S); // syso
	}
}
