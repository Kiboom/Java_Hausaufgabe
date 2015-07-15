package car;

import java.util.ArrayList;

public class Car_Test {

	public static void main(String[] args) {
		Car_Company KiboomCorp = Car_Company.getInstance();		// Single Tone으로 자동차 회사 선언
		ArrayList<Car> CarList = new ArrayList<Car>();		// 보유한 자동차의 배열
		
		for (int i=0 ; i<6 ; i++){								// 배열에 Car 객체 삽입
			if(i<3){	
				Sonata a = new Sonata();
				CarList.add(a);
			}
			else if(i<5){
				Grandeur b = new Grandeur();
				CarList.add(b);
			}
			else{
				Genesis c = new Genesis();
				CarList.add(c);
			}
		}
		
		KiboomCorp.print_Sum_CarPrices(CarList);				// 보유한 자동차의 총 가격 출
	}

}
