package Arithmetic;
import java.util.Scanner;
public class Sequence30 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System. in);
	        System. out.println( "1���� �ջ���� �ϴ� �Ѱ� ���ڸ� �Է��ϼ���");
	        System. out.println( "1���� �Է°� �������� ¦���� �ջ�˴ϴ�.");
	         int sum = 0;
	         int num = scanner.nextInt();
	         for ( int i = 1; i <= num; i++) {
	               if ( i % 2 == 1) { // Ȧ���� ���
	                     continue; // ������ �ʰ� ���� �ݺ����� ����
	               }else { // ¦���� ���
	                     sum += i;
	               }
	        }
	        System. out.println( "1���� " + num + "���� ¦���� ���� " + sum);
	 

	}

}
