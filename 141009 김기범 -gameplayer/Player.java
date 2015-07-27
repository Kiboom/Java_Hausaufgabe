package gameplayer;

import java.util.ArrayList;

public class Player{
	private ArrayList<GameLevel> levelList = new ArrayList<GameLevel>();
	private int currentLevel;
	
	public Player(){
		createLevelList();
	}
	
	public void createLevelList(){
		levelList.add(GameLevel1.getInstance());
		levelList.add(GameLevel2.getInstance());
		levelList.add(GameLevel3.getInstance());
	}
	
	public void upgradeLevel() {
		if(currentLevel>=3)
			System.out.println("이미 만렙을 찍었습니다!");
		else
			currentLevel++;
	}

	public int getCurrentLevel(){
		return currentLevel;
	}
	
	public GameLevel getGameLevel() {
		return levelList.get(currentLevel);
	}
	
	
	public void attack() {
		GameLevel gl = getGameLevel();
		gl.play();
	}
	
}
