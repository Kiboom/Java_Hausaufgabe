package maze.exit;

import maze.elements.YourPosition;
import static maze.utils.Define.*;


public class Move {

	private Direction[] move = new Direction[NUM_DIR];
	
	public Move(){
		arrayInit();
		setHowToMove();
	}
	
	
	/* 방향 배열 설정 */
	private void arrayInit(){
		for(int x=0 ; x<NUM_DIR ; x++){
			move[x] = new Direction(); 
		}
	}
	private void setHowToMove(){			// 각 방향에 따른 이동 좌표 설정
		move[NORTH].vert = 0;	
		move[NORTH].horiz = -1;	
		move[NORTH_EAST].vert = 1;	
		move[NORTH_EAST].horiz = -1;	
		move[EAST].vert = 1;	
		move[EAST].horiz = 0;	
		move[SOUTH_EAST].vert = 1;	
		move[SOUTH_EAST].horiz = 1;	
		move[SOUTH].vert = 0;	
		move[SOUTH].horiz = 1;	
		move[SOUTH_WEST].vert = -1;	
		move[SOUTH_WEST].horiz = 1;	
		move[WEST].vert = -1;	
		move[WEST].horiz = 0;	
		move[NORTH_WEST].vert = -1;	
		move[NORTH_WEST].horiz = -1;	
	}
	

	/* 특정 방향으로 이동 */
	public int setNextRow(YourPosition curPos){
		return curPos.getRow() + move[curPos.getDir()].horiz;
	}
	public int setNextCol(YourPosition curPos){
		return curPos.getCol() + move[curPos.getDir()].vert;
	}
	public void setCurPos(YourPosition yourPos, int nextRow, int nextCol) {
		yourPos.setRow(nextRow);
		yourPos.setCol(nextCol);
		yourPos.setDir(-yourPos.getDir());
	}
	
}
