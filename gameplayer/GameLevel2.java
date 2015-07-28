package gameplayer;

public class GameLevel2 extends GameLevel{

	private String name = "level2";
	private static GameLevel2 gl2 = new GameLevel2();
	
	private GameLevel2(){};
	public static GameLevel2 getInstance(){
		return gl2;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level2 simple attack: 흐이얍!");
	}

	@Override
	public void turnAttack() {
		System.out.println("level2 turn attack: 내래 돌려차기 실력을 보여주갔어!");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level2 flying attack: 이건 못해!");
	}

	public String getName(){
		return name;
	}
}
