package maze.utils;

public class Define {
	/* 맵 사이즈 */
	public static final int MAP_ROW_SIZE = 6;
	public static final int MAP_COL_SIZE = 6;	
	public static final int MAP_SIZE = MAP_ROW_SIZE * MAP_COL_SIZE;
	
	/* 시작, 끝 위치 */
	public static final int START_ROW = 1;
	public static final int START_COL = 1;	
	public static final int EXIT_ROW = MAP_ROW_SIZE-2;
	public static final int EXIT_COL = MAP_COL_SIZE-2;
	
	/* 방향 */
	public static final int NORTH = 0;
	public static final int NORTH_EAST = 1;
	public static final int EAST = 2;
	public static final int SOUTH_EAST = 3;
	public static final int SOUTH = 4;
	public static final int SOUTH_WEST = 5;
	public static final int WEST = 6;
	public static final int NORTH_WEST = 7;
	
	public static final int NUM_DIR = 8;
}
