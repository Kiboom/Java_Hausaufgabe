package maze.exit;

import static maze.utils.Define.*;
import maze.elements.Cell;
import maze.elements.MapTemplate;
import maze.elements.YourPosition;
import maze.utils.ConditionChecker;
import maze.utils.MazeMapPrinter;
import maze.utils.PathPrinter;
import maze.utils.Stack;

public abstract class BaseStrategy implements ExitStrategy{
	protected boolean found = false;
	protected Move move = new Move();
	protected MazeMapPrinter m = null;
	protected Stack stack = new Stack();
	protected PathPrinter print = new PathPrinter();
	protected YourPosition yourPos = new YourPosition();
	protected ConditionChecker condition = new ConditionChecker();
	
	protected Cell[][] maze = null;
	protected Cell[][] pathMark = new MapTemplate().getMap();		// 지나가본 길인지 표시하기 위한 지도
	
	
	@Override
	public void exitStart() {
		
		 m = new MazeMapPrinter(maze);
		 m.printMazeMap();
		
		/* 나갈만한 길이 남아있을 때까지 */
		while(condition.isThereStillWayOut(stack, found)){

			/* 길이 막히면 이전 위치로 돌아감 (시작할 때 빼고) */
			if(condition.isNotStartCell(yourPos)){
				print.beforeStep(yourPos.toString());
				yourPos = stack.pop();
				print.afterStep(yourPos.toString());
			}
			
			/* 근처에 갈 수 있는 칸을 탐색한다 */
			searchNearCells();
		}
		
		/* 더이상 나갈 길이 없을 때 */
		if(!found)
			System.out.println("NO WAY OUT!");
	}
	
	
	@Override
	public abstract void searchNearCells();
	
	@Override
	public abstract void foundExitCell();
	
	@Override
	public abstract void foundOpenCell();
	
}
