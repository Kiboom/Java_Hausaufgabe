package car;

public class Car_Test {

	public static void main(String[] args) {
		Company KiboomCorp = Company.getInstance();		// Single Tone으로 자동차 회사 선언
		Calculator calc = new Calculator();
		
		KiboomCorp.addNewCar(new Sonata());
		KiboomCorp.addNewCar(new Sonata());
		KiboomCorp.addNewCar(new Sonata());	
		KiboomCorp.addNewCar(new Grandeur());
		KiboomCorp.addNewCar(new Grandeur());	
		KiboomCorp.addNewCar(new Genesis());
						
		System.out.println("귀사가 보유한 자동차 총 가격 : " + calc.SumPrices(KiboomCorp) +"$");
	}

}
