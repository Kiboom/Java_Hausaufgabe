package school_report;

public class MajorGrading implements GradingStrategy{

	@Override
	public char generateGrade(int score) {
		if(score>=MAJ_S && score<=PERFECT)
			return 'S';
		else if(score>=MAJ_A && score<MAJ_S)
			return 'A';
		else if(score>=MAJ_B && score<MAJ_A)
			return 'B';
		else if(score>=MAJ_C && score<MAJ_B)
			return 'C';
		else if(score>=MAJ_D && score<MAJ_C)
			return 'D';
		else if(score<MAJ_D)
			return 'F';
		else
			return '?';
	}
	
}
