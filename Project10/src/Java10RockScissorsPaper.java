import java.util.Random;
import java.util.Scanner;

public class Java10RockScissorsPaper {
	public static void main(String[] args) {
		
		System.out.println("���� 0���� 2���� �Է��Ͻÿ�.");
		System.out.println("0�� ����, 1�� ����, 2�� ��");
		
		Random r = new Random();
		int computer = r.nextInt(3);
		String Data[] = {"����", "����", "��"};
		
		Scanner s = new Scanner(System.in);
		int user = s.nextInt();
		
		if(computer == user) {
			System.out.println("�����ϴ�.");
		}
		else if(computer == 0 && user == 1) {
			System.out.println("����ڰ� �̰���ϴ�.");
		}
		else if(computer == 0 && user == 2 ) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		else if(computer == 1 && user == 0 ) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		else if(computer == 1 && user == 2 ) {
			System.out.println("����ڰ� �̰���ϴ�.");
		}
		else if(computer == 2 && user == 0 ) {
			System.out.println("����ڰ� �̰���ϴ�.");
		}
		else if(computer == 2 && user == 1 ) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		System.out.printf("��ǻ�ʹ� %d�� �½��ϴ�.", Data[computer]);
	}
}
