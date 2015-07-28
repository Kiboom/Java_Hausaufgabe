package chapter7;

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop(){/*현재 위치에 정지*/}
}

class Marine extends Unit { 
	void move(int x, int y){}; 
	void stimPack(){};
}

class Tank extends Unit { 
	void move(int x, int y){}; 
	void changeMode(){};
}

class Dropship extends Unit { 
	void move(int x, int y){}; 
	void load(){};
	void uload(){};
}

public class Exercise7_17 {
	
}
