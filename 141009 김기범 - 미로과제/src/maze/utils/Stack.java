package maze.utils;

import java.util.ArrayList;
import maze.elements.YourPosition;

public class Stack {
	public ArrayList<YourPosition> stack  = new ArrayList<YourPosition>();
	private YourPosition yp = null;
	private int top = -1;
	
	public void push(YourPosition yp){
		this.yp = new YourPosition();
		this.yp.setRow(yp.getRow());
		this.yp.setCol(yp.getCol());
		stack.add(this.yp);
		top++;
	}
	
	public YourPosition pop(){
		if(isEmpty()){
			return null;
		}
		return stack.remove(top--);
	}
	
	public boolean isEmpty(){
		if(top<0){
			return true;
		}
		return false;
	}
}
