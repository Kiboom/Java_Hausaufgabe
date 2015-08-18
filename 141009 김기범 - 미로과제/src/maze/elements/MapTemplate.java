package maze.elements;

import static maze.utils.Define.*;


public class MapTemplate {

	Cell[][] map = new Cell[MAP_ROW_SIZE][MAP_COL_SIZE];

	public MapTemplate() {
		mapInit();
		map[START_ROW][START_COL].blocked = false;
		map[EXIT_ROW][EXIT_COL].blocked = false;
	}

	public void mapInit(){
		int x, y;
		for(x=0 ; x<MAP_COL_SIZE ; x++){
			for(y=0 ; y<MAP_ROW_SIZE ; y++){
				map[x][y] = new Cell();
			}
		}
	}
	
	public Cell[][] getMap() {
		return map;
	}
}
