
public class VideoShop extends Shop implements IQueue {

	public static void main(String[] args) {
	
		String temp;
		VideoShop vs = new VideoShop();
		
		System.out.println("현재 보유 비디오: "+ vs.getCount());
		
		vs.enQueue("메트릭스1");
		vs.enQueue("메트릭스2");
		vs.enQueue("메트릭스3");
		
		System.out.println("현재 보유 비디오: "+ vs.getCount());
		
		temp = vs.deQueue();
		temp = vs.deQueue();
		temp = vs.deQueue();
		
		System.out.println("현재 보유 비디오: "+ vs.getCount());
	}
	
	@Override
	public void enQueue(String video) {
		System.out.println("비디오 반납: "+ video);
		this.vt.addElement(video);
	}

	@Override
	public String deQueue() {
		
		System.out.println("비디오 대여: "+ this.vt.elementAt(0));
		return (String) this.vt.remove(0);
	}

}
