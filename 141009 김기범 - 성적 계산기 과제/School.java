package school_report;

import java.util.ArrayList;

public class School {
	
	/*Single Tone 패턴으로 구현*/
	private static School school = new School();
	
	private School(){};

	public static School getInstance(){
		if(school == null)
			school = new School();
		return school;
	}
	
	
	/* 학생 리스트에 추가 삭제*/
	private ArrayList<Student> studList = new ArrayList<Student>();
	
	public void addStudent(Student student){
		studList.add(student);
	}
	
	public void delStudent(Student student){
		studList.remove(student);
	}
	
	
	/* 점수 입력 */
	Score sc = new Score();
	public void setScore(Student student, String classId, int score){
		for(Student s : studList){
			if(student.equals(s)){
				sc.setScore(student, classId, score);
				return;
			}
		}
		System.out.println("재학생 리스트에 존재하지 않는 학생입니다!");
	}
	
	
	/* 전체 성적표 출력 */
	Report rp = new Report();
	public void getAllRecord(){					// 전체 학생 성적 출력
		rp.getAllRecord(studList);
	}
	
}
