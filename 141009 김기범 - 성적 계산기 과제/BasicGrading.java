package school_report;

public class BasicGrading implements GradingStrategy {

	@Override
	public char generateGrade(int score) {
		if(score>=BAS_A && score<=PERFECT)
			return 'A';
		else if(score>=BAS_B && score<BAS_A)
			return 'B';
		else if(score>=BAS_C && score<BAS_B)
			return 'C';
		else if(score>=BAS_D && score<BAS_C)
			return 'D';
		else if(score<BAS_D)
			return 'F';
		else
			return '?';
	}
}
