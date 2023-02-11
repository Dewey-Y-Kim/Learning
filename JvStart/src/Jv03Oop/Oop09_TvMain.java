package Jv03Oop;
import java.util.Scanner;

public class Oop09_TvMain {
	
	public Oop09_TvMain() {
	}
	Scanner scan=new Scanner(System.in);
	
	protected void startMenu () {
		Oop09_Tv tv= Oop09_Tv.getInstance();
		do {
			tv.tvInformation();
			System.out.println("메뉴 선택 (1. 볼륨 업, 2: 볼륨 다운, 3: 채널 업, 4: 채널 다운, 5: 전원");
			int menu= scan.nextInt();
			switch(menu) {
				case 1: tv.volumeUp(); break; // 볼륨 업
				case 2: tv.volumeDown(); break;// 볼륨 다운
				case 3: tv.channelUp(); break;// 채널 업
				case 4: tv.channelDown(); break; // 채널 다운
				case 5: tv.setOnOff(); break; // 전원
			}
			
		}while(true);
	}

	public static void main(String[] args) {
		Oop09_TvMain main = new Oop09_TvMain();
		main.startMenu();
	}
}
