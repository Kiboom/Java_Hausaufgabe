package car;

public class Car_Test {

	public static void main(String[] args) {
		CarCompany KiboomCorp = CarCompany.getInstance();	// Single Tone으로 자동차 회사 선언
		
		for(int i=0 ; i<6 ; i++){				// 자동차 회사에 차종별로 입고!
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
			
		KiboomCorp.print_SumPrices();				// 보유한 자동차의 총 가격 출력!
	}
}
