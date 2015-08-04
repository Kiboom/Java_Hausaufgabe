package school_report;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private String id;
	private String major;
	ArrayList<Subject> enrollList = new ArrayList<Subject>();

	
	/* 생성자 */
	private Student(){};
	public Student(String name, String id, String major) {
		this.name = name;
		this.id = id;
		this.major = major;
	}
	
	
	/* getter */
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getMajor() {
		return major;
	}


	
	/* 수강 신청 */
	public void enroll(Subject sub){			// 과목1개 수강신청
		enrollList.add(sub);
	}
	public void enroll(Subject sub1, Subject sub2){		// 과목2개 수강신청
		enrollList.add(sub1);
		enrollList.add(sub2);
	}
	public void drop(Subject subject){
		enrollList.remove(subject);
	}
	
}
