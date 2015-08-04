package school_report;

import java.util.ArrayList;

public class Report {

	public void getAllRecord(ArrayList<Student> studList) {
		
		Grade grade = new Grade();
		
		for (Student s : studList){
			grade.scoreToGrade(s);
			System.out.println(s.getName() + " " + s.getId() + " " + s.getMajor() + " ");
			for(Subject sb : s.enrollList){
				System.out.print(sb.getName() + ":" + sb.getGrade() + "   ");
			}
			System.out.println("\n-------------------");
		}
	}

}
