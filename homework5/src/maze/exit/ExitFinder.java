package maze.exit;

import java.io.FileInputStream;
import static maze.utils.Define.*;
import java.io.IOException;
import java.util.Properties;

import maze.elements.Cell;
import maze.elements.MapTemplate;
import maze.elements.MazeMap;
import maze.elements.YourPosition;
import maze.utils.Stack;

public class ExitFinder {
	
	private Cell[][] maze = null;
	private FileInputStream files = null;
	private ExitStrategy exitStrategy = null;
	
	
	/* 생성자 */
	private ExitFinder(){}	
	public ExitFinder(MazeMap mazeMap) throws IOException {
		this.maze = mazeMap.getMap();
		setExitStrategy();
	}
	
	
	/* 탐색전략 설정: 4방향일때 or 8방향일때 */
	public void setExitStrategy() throws IOException{
		try{
			files = new FileInputStream("maze.properties");
			Properties prop = new Properties();
			prop.load(files);
			String direction = prop.getProperty("DIRECTION");
			if(direction.equals("8")){
				exitStrategy = new EightDirFinder(maze);
				return;
			}
			else if(direction.equals("4")){
				exitStrategy = new FourDirFinder(maze);
				return;
			}
			else{
				System.out.println("환경파일의 DIRECTION 값은 4 또는 8만 가질 수 있습니다!\n");
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			files.close();
		}
	}
	
	
	/* Exit 시작 */
	public void exitStart(){
		exitStrategy.exitStart();
	}
}
