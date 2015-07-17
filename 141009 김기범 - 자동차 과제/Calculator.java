package car;

import java.util.ArrayList;

public class Calculator {
	private int Sum = 0;								

	public int SumPrices(Company company){
		ArrayList<Car> CarList = company.getList();
		
		for(Car car : CarList){
			Sum += car.getPrice();
		}
		return Sum;
	}
}
