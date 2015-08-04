package school_report;

public interface GradingStrategy {
	
	int PERFECT = 100;
	
	/* 전공자 기준 : 각 학점 커트라인 점수 */
	int MAJ_S = 95;
	int MAJ_A = 90;
	int MAJ_B = 80;
	int MAJ_C = 70;
	int MAJ_D = 60;
	
	/* 비전공 기준 : 각 학점 커트라인 점수 */
	int BAS_A = 90;
	int BAS_B = 80;
	int BAS_C = 70;
	int BAS_D = 55;
	
	public char generateGrade(int score);;
}
