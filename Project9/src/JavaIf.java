
public class JavaIf {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		boolean c;
		
		// ��ȣ�� �� �־� ��������� ��������!
		c = (a != b) && (a > b);
		System.out.print(c);
		System.out.println();
		System.out.println();
		
		int num = 5;
		
		if(num < 5) {
			System.out.println("num�� 5���� �۴�.");
		}
		else if(num > 5) {
			System.out.println("num�� 5���� ũ��.");
		}
		else {
			System.out.println("num�� 5�� ����.");
		}
			
	}
}
