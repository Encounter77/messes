package test3;
import java.util.Scanner;
public class TestSoundable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("1.Radio");
		System.out.println("2.Walkman");
		System.out.println("3.Mobilephone");
		System.out.print("请输入您需要的播放设备的序号:");
		Soundable s = null;
		int flag = scanner.nextInt();
			switch(flag){
				case 1: s = new Radio();break;
				case 2: s = new Walkman();break;
				case 3: s = new Mobilephone();break;
				default :System.out.println("您选择播放设备不在播放列表中！");break;
			}
			if(s!=null){
				s.SoundOccur();
				System.out.print("您是否需要调节该播放设备的音量？是(Y)否(N),请输入:");
				char c = scanner.next().charAt(0);
				if(c=='Y'){
					System.out.println("请输入音量加减按钮！");
					char r = scanner.next().charAt(0);
					if(r=='+')
						s.ChangeVolume('+');
					else if(r=='-')
						s.ChangeVolume('-');
				}
				System.out.println("谢谢您的使用！");
			}
		}
	}
}
