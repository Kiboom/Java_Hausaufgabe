package gameplayer;

public class GameLevel1 extends GameLevel{

	private String name = "level1";
	private static GameLevel1 gl1 = new GameLevel1();
	
	private GameLevel1(){};
	public static GameLevel1 getInstance(){
		return gl1;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level1 simple attack: 이얍!");
	}

	@Override
	public void turnAttack() {
		System.out.println("level1 turn attack: 이건 못해!");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level1 flying attack: 이것도 못해!");
	}

	public String getName(){
		return name;
	}
}
