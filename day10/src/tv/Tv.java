package tv;

public class Tv {
	private boolean power;
	private int channel;
	
	 public void power() {
		power = !power;
		if(power)
			System.out.println("전원을 켭니다");
		else
			System.out.println("전원을 끕니다");
	}
	 void channelUp() {
		++channel;
		System.out.println("현재 채널 : " + channel);
	}
	 void channelDown() {
		--channel;
		System.out.println("현재 채널 : " + channel);
	}
}
