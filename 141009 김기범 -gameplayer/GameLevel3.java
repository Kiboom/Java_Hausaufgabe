package gameplayer;

public class GameLevel3 extends GameLevel {

	private String name = "level3";
	private static GameLevel3 gl3 = new GameLevel3();
	
	private GameLevel3(){};
	public static GameLevel3 getInstance(){
		return gl3;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level3 simple attack: 끼이야압!");
	}

	@Override
	public void turnAttack() {
		System.out.println("level3 turn attack: 내래 만렙의 돌려차기 실력을 보여주갔어!");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level3 flying attack: 내래 인민의 날라차기 실력도 보여주갔어!");
	}

	public String getName(){
		return name;
	}
}
