import java.util.Random;

public class JavaDiceSwitch {
	public static void main(String[] args) {
		
		Random randomValue = new Random();
		int dice = randomValue.nextInt(6) + 1;
		
		System.out.println(dice);
		
		switch (dice) {
		case 1: System.out.println("�۸�");
			break;
		case 2: System.out.println("�߿�");
			break;	
		case 3: System.out.println(3);
			break;
		case 4: System.out.println(4);
			break;
		case 5: System.out.println(5);
			break;
		case 6: System.out.println(6);
			break;
		}
	}
}
