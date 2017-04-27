package tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV (int channel, int volume, boolean power) {
		if (channel <= 255 && channel >= 1)
		this.channel = channel;
		else {
			System.out.println("올바르지 못한 값이 입력되어 채널을 1번으로 설정합니다.\n");
			this.channel = 1;
		}
		if (volume <= 100 && volume >= 0)
		this.volume = volume;
		else {
			System.out.println("올바르지 못한 값이 입력되어 볼륨을 1로 설정합니다.\n");
			this.volume = 1;
		}
		this.power = power;
	}

	//Watch에 알맞은 생성자 만들기
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public void power ( boolean on ) {
		if ( power == true )
			power = false;
		else power = true;
	}
	
	public void channel( int channel ) {
		if (channel > 0 && channel <= 255)
			this.channel = channel;
		else System.out.println("값이 올바르지 않습니다. 현재 채널을 유지합니다.\n");
	}
	
	public void channel ( boolean up ) {
		if (up == true) {
			if(channel == 255)
				channel = 1;
			else channel++;
		}
		else {
			if(channel == 1)
				channel = 255;
			else channel--;
		}
	}
	
	public void volume ( int volume ) {
		if (volume >= 0 && volume <= 100)
			this.volume = volume;
		else System.out.println("값이 올바르지 않습니다. 현재 볼륨을 유지합니다.\n");
	}
	
	public void volume ( boolean up ) {
		if (up == true ) {
			if (volume != 100)
				volume++;
		}
		else {
			if (volume != 0)
				volume--;
		}
	}
	
	public void status() {
		System.out.println("<TV>");
		System.out.print("현재 전원 상태 : ");
		if (power == true)
			System.out.print("ON" + "\n");
		else System.out.print("OFF" + "\n");
		System.out.print("현재 채널 : " + channel + "번\n");
		System.out.print("현재 볼륨 : " + volume + "\n\n");
		
	}
}
