package maze.test;

import java.io.IOException;
import maze.elements.MazeMap;
import maze.exit.ExitFinder;

public class TestMain {

	public static void main(String[] args) throws IOException {

		MazeMap mazeMap = new MazeMap();
		ExitFinder exitFinder = new ExitFinder(mazeMap);
		exitFinder.exitStart();
		
	}

}
