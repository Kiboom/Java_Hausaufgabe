package car;

public class Car_Test {

	public static void main(String[] args) {
		Company KiboomCorp = Company.getInstance();		// Single Tone으로 자동차 회사 선언
		Calculator calc = new Calculator();
		
		for(int i=0 ; i<6 ; i++){						// 자동차 회사에 차종별로 입고!
			if(i<3){
				KiboomCorp.addCar(new Sonata());
			}
			else if(i<5){
				KiboomCorp.addCar(new Grandeur());
			}
			else{
				KiboomCorp.addCar(new Genesis());
			}
		}
		
		int Sum = calc.calcPrices(KiboomCorp);				
		System.out.println("귀사가 보유한 자동차 총 가격 : " + Sum +"$");
	}

}
