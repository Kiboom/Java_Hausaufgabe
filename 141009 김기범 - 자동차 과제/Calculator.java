package car;

import java.util.ArrayList;

public class Calculator {
	int SumPrices=0;								

	public int calcPrices(Company company){
		ArrayList<Car> CarList = company.getList();
		
		for(Car car : CarList){
			SumPrices += car.getPrice();
		}
		return SumPrices;
	}
}
