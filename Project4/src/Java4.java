import java.util.Scanner;

public class Java4 {
	public static void main(String[] args) {
		System.out.println("ȭ�鿡 ���ڸ� �Է����ּ���!");
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.println("����� �Է��� ���ڴ�");
		System.out.println(inputNumber);
		System.out.print('\n');
		
		System.out.println();
		System.out.println("ù��° ���� �Է� ���");
		int iN3 = s.nextInt();
		System.out.println();
		System.out.println("�ι�° ���� �Է� ���");
		int iN4 = s.nextInt();
		System.out.println(iN3*iN4);
		
		System.out.println();
		System.out.println("����� ����̽ʴϱ�?");
		Scanner y = new Scanner(System.in);
		int iN = y.nextInt();
		System.out.println("����� ���̴�");
		System.out.print('\"');
		System.out.print(iN);
		System.out.print('\"');
		System.out.print("�� �Դϴ�.");
		System.out.print('\n');
		/*Scanner y = new Scanner(System.in);
		   <- ���� ������ �ʿ���� ��������� �״�� ��밡���� ���� �Ʒ��� �ڵ带 ���� �� �� ����.*/
		
		System.out.print('\n');
		System.out.println("�� ���ڸ� �Է��� �ּ���!");
		int iN2 = s.nextInt();
		System.out.println("����� �Է��� ���� +10��");
		System.out.print(iN2+10);
		
	}	
}