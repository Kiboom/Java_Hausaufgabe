package gameplayer;

public abstract class GameLevel {

	public abstract String getName();
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
		
	public final void play(){
		System.out.println("==========="+getName()+" start===========");
		simpleAttack();
		turnAttack();
		flyingAttack();
		System.out.println("==========="+getName()+" end ============\n");
	}
}
