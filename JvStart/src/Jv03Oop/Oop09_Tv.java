package Jv03Oop;

public class Oop09_Tv {
	// 최대 채널
	static final int MAX_CHANNEL = 20;
	
	// 최대 볼륨
	static final int MAX_VOLUME = 30;
	
	boolean power = false; //전원상태
	int volume; //현재볼륨
	int channel = 1; //현재 채널
	
	
	// 생성자메소 오버로
	public Oop09_Tv() {
		// TODO Auto-generated constructor stub
		power = true;
		volume = 10;
		channel = 11;
	}
	
	protected Oop09_Tv(boolean power, int channel, int volume) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
	protected Oop09_Tv(int channel, boolean power, int volume) {
		this(power, channel, volume); //다른 생성자 호출, 처음 실행문이어야 한다.
	}
	
	protected Oop09_Tv(int channel, int volume, boolean power) {
		this(power, channel, volume);
	}
	
	public static Oop09_Tv getInstance() {
		return new Oop09_Tv();
	}
	
	// 현재 정보 출력
	public void tvInformation() {
		System.out.println("전원:"+power+" 채널:"+channel+" 볼륨:"+volume);
	}
	// 메뉴
	
	
	public void channelUp(){
		channel++;
		if(channel > MAX_CHANNEL) {
			channel = 1;
		}
	}
	public void channelDown(){
		if(channel < 1) {
			channel = MAX_CHANNEL;
		}
	}
	public void volumeUp(){
		volume++;
		if(volume > MAX_VOLUME) { 
			volume = MAX_VOLUME; 
		}
	}
	public void volumeDown() {
		volume--;
		if(volume < 0 ) {
			volume = 0;
		}
	}
	public void setOnOff() {
		power = !power;
		if(!power) { //프로그램 종료
			System.exit(0); // 0: 정상종료
		}
	}

}
