package Arithmetic;
/**
1+2+3+4+...+100 ������ �հ踦 ���ϴ� �������� �ۼ��Ͻÿ�
[����]
      i : ��
      sum : �հ�
[���]
      ====================
      1+2+3+...+100���� ��
      =====================
      5050
      =====================
 * */
public class Sequence100 {
	public static void main(String[] args) {
		int i=0, x=0;
		while(true){
			i++;
			x += i;
			if(i<100){
				continue;
			}else{
				break;
			}
		}
		System.out.println(x);
	}
}
