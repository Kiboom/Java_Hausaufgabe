package car;

import java.util.ArrayList;

public class Company {
	private ArrayList<Car> CarList = new ArrayList<Car>();	// 보유한 자동차 리스트
	private static Company company = new Company();	// Single Tone 만들기
	
	private Company(){}									// Single Tone 만들기
	
	public ArrayList<Car> getList(){
		return CarList;
	}
	
	public static Company getInstance(){					// Single Tone 만들기
		if(company == null)
			company = new Company();
		return company;
	}

	public void addNewCar(Car car){							// 자동차 입고!
		CarList.add(car);
	}	
}
