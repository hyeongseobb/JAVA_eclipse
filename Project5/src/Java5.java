import java.util.Scanner;

public class Java5 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է����ּ���!");
		
		Scanner scan1 = new Scanner(System.in);
		int number1 = scan1.nextInt();
		int sumNumber = number1 + 10;
		/*System.out.println("�Է¹��� ���� +10��");
		System.out.println(sumNumber);
		System.out.println("�Դϴ�.");
		*/
		System.out.printf("�Է¹��� ���� +10�� %d�Դϴ�.", sumNumber);
		
		System.out.print('\n');
		System.out.println();
		System.out.println("ù��° ���ڸ� �Է����ּ���!");
		double fN = scan1.nextDouble();
		System.out.println("�ι�° ���ڸ� �Է����ּ���!");
		double sN = scan1.nextDouble();
		double sum = fN + sN;
		
		System.out.printf("%f�� %f�� ���� %f�Դϴ�.", fN, sN, sum);
		
 }
}