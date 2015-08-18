package maze.utils;

import static maze.utils.Define.*;

import maze.elements.Cell;
import maze.elements.YourPosition;


public class ConditionChecker {


	public boolean isNotStartCell(YourPosition yourPos) {
		if(yourPos.getRow()!=START_ROW || yourPos.getCol()!=START_COL)
			return true;
		return false;
	}

	public boolean isExitCell(YourPosition yourPos, int nextRow, int nextCol) {
		if((nextRow==EXIT_ROW && nextCol==EXIT_COL) || (yourPos.getRow()==EXIT_ROW && yourPos.getCol()==EXIT_COL))
			return true;
		return false;
	}

	public boolean canSearchMore(YourPosition yourPos, boolean found) {
		if((yourPos.getDir() < NUM_DIR) && !found)
			return true;
		return false;
	}

	public boolean isThereStillWayOut(Stack stack, boolean found) {
		if(!stack.isEmpty() && !found) 
			return true;
		return false;
	}

	public boolean isOpenCell(Cell[][] maze, Cell[][] pathMark, int nextRow, int nextCol) {
		if(!maze[nextRow][nextCol].blocked && !pathMark[nextRow][nextCol].visited)
			return true;
		return false;
	}
	
}
