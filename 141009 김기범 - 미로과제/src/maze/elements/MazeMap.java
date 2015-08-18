package maze.elements;


public class MazeMap extends MapTemplate{

	public MazeMap(){
		mazeGenerator();
	}
	
	
	public void mazeGenerator(){
		map[1][2].blocked = false;
		map[1][3].blocked = false;
		map[2][1].blocked = false;
		map[3][1].blocked = false;
		map[3][3].blocked = false;
		map[4][1].blocked = false;
		map[4][2].blocked = false;
		map[4][3].blocked = false;
	}
	
}
