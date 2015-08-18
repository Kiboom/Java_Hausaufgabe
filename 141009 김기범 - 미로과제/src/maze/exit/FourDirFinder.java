package maze.exit;

import static maze.utils.Define.START_COL;
import static maze.utils.Define.START_ROW;

import maze.elements.Cell;


public class FourDirFinder extends BaseStrategy implements ExitStrategy {
	
	private int nextRow, nextCol;
	
	
	/* 생성자 */
	protected FourDirFinder(){}
	public FourDirFinder(Cell[][] maze){
		this.maze = maze;
		stack.push(yourPos);								// 스택에 시작 위치를 푸쉬
		pathMark[START_ROW][START_COL].visited = true;		// 시작 위치를 방문했다고 표시	
	}
	
	
	@Override
	public void searchNearCells() {
		
		/* 근처에 이동할만한 칸이 남아있을 때까지 */
		while(condition.canSearchMore(yourPos, found)){
			nextRow = move.setNextRow(yourPos);
			nextCol = move.setNextCol(yourPos);
			
			/*출구 도착*/
			if(condition.isExitCell(yourPos, nextRow, nextCol)){
				foundExitCell();
			}
			/*인접 셀 방문*/
			else if(condition.isOpenCell(maze, pathMark, nextRow, nextCol)){
				foundOpenCell();
				continue;
			}
			/*다음 방향을 후보로 지정*/
			else{
				yourPos.setDir(+2);
			}
		}
	}
	
	
	@Override
	public void foundExitCell(){
		print.beforeStep(yourPos.toString());
		print.afterStep("EXIT");
		found=true;
	}
	
	
	@Override
	public void foundOpenCell(){
		pathMark[nextRow][nextCol].visited=true;
		yourPos.setDir(+2);						//다음 이동 방향 지정
		stack.push(yourPos);					//현재위치 및 다음 이동방향 저장.
		
		print.beforeStep(yourPos.toString());
		move.setCurPos(yourPos, nextRow, nextCol);
		print.afterStep(yourPos.toString());
	}
	
}
