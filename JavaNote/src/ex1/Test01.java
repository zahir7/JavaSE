package ex1;

public class Test01 {
	private int score = 90;	
	public void setScore(int score){
		if (score >= 0 && score <= 100) {
			this.score = score;	
		}	
	}
	public int getScore(){		
		return score;
	}
}
