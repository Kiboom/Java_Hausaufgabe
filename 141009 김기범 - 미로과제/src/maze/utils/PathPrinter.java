package maze.utils;

import static maze.utils.Define.*;


public class PathPrinter {

	private static int step = 1;
	
	
	/* 이동하기 전 위치 출력*/
	public void beforeStep(String before){
		System.out.print("STEP"+ step + ": [" + before +"] ");
		step++;
	}
	
	
	/* 이동한 후의 위치 출력*/
	public void afterStep(String after){
		if(after.equals("EXIT")){
			System.out.print("-> " + "["); 
			System.out.print(EXIT_ROW + ", ");
			System.out.print(EXIT_COL +"]");
			System.out.println("  얏호! 나왔다!!");
			return;
		}
		System.out.println("-> " + "[" + after +"]");
	}
}
