package car;

import java.util.ArrayList;

public class Car_Company {
	private ArrayList<Car> CarList;				// 보유한 자동차 리스트
	private int SumOfCarPrices=0;				// 보유한 자동차 총 가격
	private static Car_Company instance = new Car_Company();	// Single Tone 만들기
	
	private Car_Company(){}						// Single Tone 만들기
	
	public static Car_Company getInstance(){	// Single Tone 만들기
		if(instance == null)
			instance = new Car_Company();
		return instance;
	}
	
	public int getSumOfCarPrices(ArrayList<Car> CarList){		// 총 가격 반환
		this.CarList = CarList;
		return SumOfCarPrices;
	}

	public void setSumOfCarPrices(int sum_CarPrices) {			// 총 가격 설정
		SumOfCarPrices = sum_CarPrices;
	}

	public int calculate_Prices(){								// 총 가격 계산
		for (Car car : CarList){
			SumOfCarPrices += car.getPrice();
		}
		return SumOfCarPrices;
	}
	
	public void print_Sum_CarPrices(ArrayList<Car> CarList){	// 총 가격 출력
		this.CarList = CarList;
		System.out.println("보유한 자동차 총 가격 : " + calculate_Prices() + "$");
	}
	
}
