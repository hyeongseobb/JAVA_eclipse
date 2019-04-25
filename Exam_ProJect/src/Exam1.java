import java.util.Scanner;
public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int studentScore1 = sc.nextInt();
		int studentScore2 = sc.nextInt();
		int studentScore3 = sc.nextInt();
		
		//모두다 동점인 경우
		if(studentScore1 == studentScore2 && studentScore2 == studentScore3){
			System.out.println("공동 일등");
		}
		
		//순위가 명확하게 매겨지는 경우
		else if(studentScore1 > studentScore2 && studentScore2 > studentScore3){
			System.out.println("첫번째학생 1등, 두번째학생 2등, 세번째학생 3등");
		}
		else if(studentScore2 < studentScore3 && studentScore3 < studentScore1){
			System.out.println("첫번째학생 1등, 두번째학생 3등, 세번째학생 2등");
		}
		else if(studentScore2 < studentScore1 && studentScore1 < studentScore3){
			System.out.println("첫번째학생 2등, 두번째학생 3등, 세번째학생 1등");
		}
		else if(studentScore3 < studentScore1 && studentScore3 < studentScore2){
			System.out.println("첫번째학생 2등, 두번째학생 1등, 세번째학생 3등");
		}
		else if(studentScore1 < studentScore2 && studentScore2 < studentScore3){
			System.out.println("첫번째학생 3등, 두번째학생 2등, 세번째학생 1등");
		}
		else if (studentScore1 < studentScore3 && studentScore3 < studentScore2){
			System.out.println("첫번째학생 3등, 두번째학생 1등, 세번째학생 2등");
		}
		
		//공동 2등인경우
		else if (studentScore1 == studentScore2 && studentScore1 < studentScore3){
			System.out.println("첫번째 두번째 학생 공동2등 , 세번째학생 1등");
		}
		else if (studentScore1 == studentScore2 && studentScore1 > studentScore3){
			System.out.println("첫번째 두번재 학생 공동 1등 , 세번째학생 3등");
		}
		else if (studentScore1 == studentScore3 && studentScore1 < studentScore2){
			System.out.println("첫번째 세번째 학생 공동2등 , 두번째학생 1등");
		}
		else if (studentScore1 == studentScore3 && studentScore1 > studentScore2){
			System.out.println("첫번째 세번재 학생 공동 1등 , 두번째학생 3등");
		}
		else if (studentScore2 == studentScore3 && studentScore2 < studentScore1){
			System.out.println("두번째 세번째 학생 공동2등 , 첫번째학생 1등");
		}
		else if (studentScore2 == studentScore3 && studentScore3 > studentScore1){
			System.out.println("두번째 세번재 학생 공동 1등 , 첫번째학생 3등");
		}
	}
}
