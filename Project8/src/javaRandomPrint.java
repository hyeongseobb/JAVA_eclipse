import java.util.Random;
import java.util.Scanner;

public class javaRandomPrint {
	public static void main(String[] args) {
		
		Random r = new Random();
		int randomValue = r.nextInt(100);
		int randomValue2 = r.nextInt(100);

		System.out.println(randomValue);
		// System.out.println("������ :"+ (randomValue % 2));
		System.out.println(randomValue2);
		
		if(randomValue > randomValue2) {
			System.out.println("ù��°�� �¸�\t" + randomValue);
		}
		else if(randomValue == randomValue2) {
			System.out.println("���º�");
		}
		else {
			System.out.println("�ι�°�� �¸�\t" + randomValue2);
		}
		
		System.out.println("���ڸ� �Է��Ͻÿ�");
		
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		
		System.out.printf("����� �Է��� ���� %d�Դϴ�.", inputNumber);
		
	}
}

