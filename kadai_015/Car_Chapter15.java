package kadai_015;

public class Car_Chapter15 {
	private int gear= 1;
	private int speed =10;
	
	public void gearChange (int afterGear) {
		int beforeGear = this.gear;
		this.gear = afterGear;
		switch (afterGear) {
			case 1:
			    this.speed = 10;
			    break;
			case 2:
				this.speed = 10;
				break;
			case 3:
                this.speed = 30;
                break;
            case 4:
                this.speed = 40;
                break;
            case 5:
                this.speed = 50;
                break;
            default:
                this.speed = 10;
                break;		
		}
		System.out.println("ギア"+beforeGear+"から"+afterGear+"に切り替えます");
		
	}
	public void run() {
		System.out.println("速度は時速"+speed+"kmです");
	}
	
	}


