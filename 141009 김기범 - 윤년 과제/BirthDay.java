package birthday_0703;

public class BirthDay {

	private int year;
	private int month;
	private int day;
	private String rightwrong="유효";
	
	public BirthDay(int year, int month, int day){		// 생성자
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public boolean isLeapYear(){				// 윤년인지 아닌지 확인
		if(year%4==0 && year%400==0){
			return true;
		}else if(year%4==0 && year%100!=0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isTheMonthHas30(){			// 30일까지 밖에 없는 달인지 확인
		if(month==4 || month==6 || month==9 || month==11){
			return true;
		}else{
			return false;
		}
	}
	
	public void checkRightWrong() {				// 입력한 날짜가 유효인지 아닌지 확인
		if(year<1 || month<1 || month>12 || day<1 || day>31){
			rightwrong = "무효 (날짜에 적합하지 않은 숫자 입력)";
			return;
		}
		if(month==2 && day>29){
			rightwrong = "무효 (날짜에 적합하지 않은 숫자 입력)";
			return;
		}
		if(month==2 && day==29 && !isLeapYear()){
			rightwrong = "무효 (윤년이 아닌데 29일 입력)";
			return;
		}
		if(day==31 && isTheMonthHas30()){
			rightwrong = "무효 (입력한 월은 31일이 없음)";
		}
	}

	public void showResult() {					// 입력한 날짜와 유효 여부 출력
		checkRightWrong();
		System.out.print(year +"년 " + month +"월 "+ day +"일 : ");
		System.out.println(rightwrong);	
	}
}

/*
constructor: 연월일 인스턴스 변수를 바꿔주는 행위. 
printResult: 체크 메소드를 실행. 그 결과를 출력하기! 
checkRightWrong: 인스턴스 변수를 체크 알고리즘을 거친 뒤, 그 결과를 String 변수로 표현된 유효여부에 반영! 
	   체크1: 연, 월, 일 중 어느 하나에 0000이 있는지? -> String에 "무효: 날짜에 적합하지 않은 숫자 입력"
	   체크2: 만약 2월인데, 윤년이 아닐 때! -> "무효: 윤년이 아님"
   	   체크3: 기타 월에 따른 일이 맞지 않을 때! ->  "무효: 입력한 월은 30일까지 밖에 없음" 
isLeapYear: 반환값은 boolean.  

*/
