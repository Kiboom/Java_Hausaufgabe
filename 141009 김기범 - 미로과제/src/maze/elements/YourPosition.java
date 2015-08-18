package maze.elements;

import static maze.utils.Define.*;


public class YourPosition {
	private int row, col;
	private int dir; 		// 어느 방향으로 향할건지

	
	public YourPosition() {
		row = START_ROW; 	// 시작 위치를 1,1로 초기화
		col = START_COL;
		dir = NORTH;		// 방향을 북쪽으로 초기화
	}

	
	/* Getter and Setter */
	public int getRow() {
		return row;
	}
	public void setRow(int x) {
		this.row = x;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int y) {
		this.col = y;
	}
	public int getDir() {
		return dir;
	}
	public void setDir(int offset) {
		this.dir += offset;
	}
	
	
	@Override
	public String toString(){
		return String.valueOf(row) + ", " + String.valueOf(col);
	}

}
