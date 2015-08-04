package school_report;

public class School_Test {

	public static void main(String[] args) {
		School school = School.getInstance();
		
		Student stud1 = new Student("한효주", "141213", "수학");		
		Student stud2 = new Student("나오미", "141518", "영어");		
		Student stud3 = new Student("엠마왓슨", "141230", "수학");		
		Student stud4 = new Student("에밀리아", "141255", "수학");		
		Student stud5 = new Student("꽃님이", "141590", "영어");
		
		/*학적 등록*/
		school.addStudent(stud1);
		school.addStudent(stud2);
		school.addStudent(stud3);
		school.addStudent(stud4);
		school.addStudent(stud5);		
		
		/*수강 신청*/
		stud1.enroll(new Math(), new Eng());
		stud2.enroll(new Math(), new Eng());
		stud3.enroll(new Math(), new Eng());
		stud4.enroll(new Math(), new Eng());
		stud5.enroll(new Math(), new Eng());
		
		/*수학 점수 입력*/
		school.setScore(stud1, "100", 95);	//인자: 학생, 과목번호, 성적 
		school.setScore(stud2, "100", 90);	//수학 과목번호:100,  영어 과목번호:200  
		school.setScore(stud3, "100", 76);
		school.setScore(stud4, "100", 85);
		school.setScore(stud5, "100", 90);
		
		/*영어 점수 입력*/
		school.setScore(stud1, "200", 20);
		school.setScore(stud2, "200", 100);
		school.setScore(stud3, "200", 60);
		school.setScore(stud4, "200", 89);
		school.setScore(stud5, "200", 95);
		
		/*성적 출력*/
		school.getAllRecord();
	}

}