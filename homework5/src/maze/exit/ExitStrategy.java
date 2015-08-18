package maze.exit;


//시나리오 맹들어주기.

public interface ExitStrategy {

	void exitStart();			// 탈출 시작
	void searchNearCells();		// 인접한 칸들을 살펴봄
	void foundExitCell();		// 도착지를 찾았을 때! (얏호)
	void foundOpenCell();		// 인접한 칸이 막혀있지 않아서 갈 수 있을 때 (가자가자)
	
}
