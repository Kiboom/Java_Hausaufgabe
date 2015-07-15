package car;

import java.util.ArrayList;

public class CarCompany {
<<<<<<< HEAD
	private int SumPrices=0;								// 보유한 자동차 총 가격
	private ArrayList<Car> CarList = new ArrayList<Car>();	// 보유한 자동차 리스트
	private static CarCompany company = new CarCompany();	// Single Tone 만들기
=======
	private int SumPrices=0;							// 보유한 자동차 총 가격
	private ArrayList<Car> CarList = new ArrayList<Car>();				// 보유한 자동차 리스트
	private static CarCompany instance = new CarCompany();				// Single Tone 만들기
>>>>>>> origin/master
	
	private CarCompany(){}								// Single Tone 만들기
	
<<<<<<< HEAD
	public static CarCompany getInstance(){					// Single Tone 만들기
		if(company == null)
			company = new CarCompany();
		return company;
=======
	public static CarCompany getInstance(){						// Single Tone 만들기
		if(instance == null)
			instance = new CarCompany();
		return instance;
>>>>>>> origin/master
	}

	public void addCar(Car car){							// 자동차 입고!
		CarList.add(car);
	}
	
	public int calculate_SumPrices(){						// 총 가격 계산
		for (Car car : CarList){
			SumPrices += car.getPrice();
		}
		return SumPrices;
	}
	
	public void print_SumPrices(){							// 총 가격 출력
		System.out.println("보유한 자동차 총 가격 : " + calculate_SumPrices() + "$");
	}
	
}
