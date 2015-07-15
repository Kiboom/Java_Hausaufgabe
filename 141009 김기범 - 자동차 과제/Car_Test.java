package car;

public class Car_Test {

	public static void main(String[] args) {
		CarCompany KiboomCorp = CarCompany.getInstance();		// Single Tone으로 자동차 회사 선언
		
		for(int i=0 ; i<6 ; i++){					// 자동차 회사에 차종별로 입고!
			if(i<3){
				Sonata sonata = new Sonata();
				KiboomCorp.addCar(sonata);
			}
			else if(i<5){
				Grandeur grandeur = new Grandeur();
				KiboomCorp.addCar(grandeur);
			}
			else{
				Genesis genesis = new Genesis();
				KiboomCorp.addCar(genesis);
			}
		}
			
		KiboomCorp.print_SumPrices();				// 보유한 자동차의 총 가격 출력!
	}

}
