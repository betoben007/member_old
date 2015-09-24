
public class HybridWaterCar extends HybridCar {
	
	int waterGauge;
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린: "+ gasolineGauge);
		System.out.println("잔여 전기량: "+ electricGauge);
		System.out.println("잔여 워터량: "+ waterGauge);
	}
	
	public HybridWaterCar(int ga, int el, int wa) {
		super(ga, el);
		waterGauge = wa;
	}
}
