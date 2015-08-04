package school_report;

public class Subject {
	private String name;
	private String id;
	private int score;
	private char grade;

		
	/* Getter and Setter */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if(score>100 || score<0){
			System.out.println("성적은 0이상 100이하로 입력해주십시오!");
			return;
		}
		this.score = score;
	}
	public char getGrade(){
		return grade;
	}
	public void setGrade(char grade){
		if((grade!='S'&&grade!='A'&&grade!='B'&&grade!='C'&&grade!='D'&&grade!='F')){
			System.out.println("성적은 S, A, B, C, D, F 중 대문자로 입력해주십시오!");
			return;
		}
		this.grade = grade;
	}
	
	
	/* Equals 오버라이드*/
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof Subject){			
			Subject subject = (Subject)obj;
			return this.id.equals(subject.id);			
		}
		return false;
	}
	@Override
	public int hashCode() {				
		return id.hashCode();	
	}
}
