package school_report;

public class Score {
	
	/* 점수 입력 */
	public void setScore(Student student, String classId, int score){
		for(Subject s : student.enrollList){
			if(s.getId().equals(classId)){
				s.setScore(score);
				return;
			}
		}
		System.out.println("학수번호 "+classId+" 과목이 등록되어 있지 않습니다");
		return;
	}
	
}
