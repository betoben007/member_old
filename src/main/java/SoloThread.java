
public class SoloThread extends Thread{

	private SaveMoney save = null;
	
	public SoloThread(SaveMoney save) {
		this.save = save;
	}
	
	public SoloThread(MinusMoney minus) {
		
		this.save = save;
	}
}
