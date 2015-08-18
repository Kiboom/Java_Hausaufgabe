package maze.utils;

import maze.elements.Cell;
import static maze.utils.Define.*;


public class MazeMapPrinter {

	private Cell[][] maze = null;

	/* 생성자 */
	private MazeMapPrinter() {};
	public MazeMapPrinter(Cell[][] maze) {
		this.maze = maze;
	}

	
	public void printMazeMap() {
		int row, col;
		System.out.println("▩ : blocked");
		System.out.println("▤ : unblocked");
		System.out.println("◈ : start & exit\n");
		
		for (row = 0; row < MAP_ROW_SIZE; row++) {
			for (col = 0; col < MAP_COL_SIZE; col++) {
				if ((row == START_ROW && col == START_COL) || (row == EXIT_ROW && col == EXIT_COL)){
					System.out.print("◈ "); continue;
				}
				else if(maze[row][col].blocked == true && col!=MAP_COL_SIZE-1){
					System.out.print("▩ "); continue;
				}
				else if(maze[row][col].blocked == true && col==MAP_COL_SIZE-1){
					System.out.println("▩ "); continue;
				}
				else if(maze[row][col].blocked == false && col!=MAP_COL_SIZE-1){
					System.out.print("▤ "); continue;
				}				
				else if(maze[row][col].blocked == false && col==MAP_COL_SIZE-1){
					System.out.println("▤ "); continue;
				}
				
			}
		}
		
		System.out.println("");

	}

}
