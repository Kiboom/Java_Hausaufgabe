package school_report;

public class Grade {

	
	/* 학생의 점수를 학점화 */
	public void scoreToGrade(Student student){
		GradingStrategy gs;
		
		for(Subject s : student.enrollList){
			if(s.getName().equals(student.getMajor())){		// 해당 과목이 전공인 경우
				gs = new MajorGrading();
				s.setGrade(gs.generateGrade(s.getScore()));	// 전공생 평가 기준을 적용
			}
			gs = new BasicGrading();
			s.setGrade(gs.generateGrade(s.getScore()));		// 비전공생 평가 기준을 적용
		}
	}
	
}
