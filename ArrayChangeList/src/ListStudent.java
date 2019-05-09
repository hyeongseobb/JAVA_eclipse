import java.util.Random;

public class ListStudent {
	String name;
	int middleScore;
	int finalScore;
	
	ListStudent(String name) {
		this.name = name;
		Random rand = new Random();
		this.middleScore = rand.nextInt(1001);
		this.finalScore = rand.nextInt(1001);
	}
	@Override
	public String toString() {
		return this.name + " (중간 : " + this.middleScore + ", 기말 : " + this.finalScore + ")";
	}
}
