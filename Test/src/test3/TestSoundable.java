package test3;
import java.util.Scanner;
public class TestSoundable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("1.Radio");
		System.out.println("2.Walkman");
		System.out.println("3.Mobilephone");
		System.out.print("����������Ҫ�Ĳ����豸�����:");
		Soundable s = null;
		int flag = scanner.nextInt();
			switch(flag){
				case 1: s = new Radio();break;
				case 2: s = new Walkman();break;
				case 3: s = new Mobilephone();break;
				default :System.out.println("��ѡ�񲥷��豸���ڲ����б��У�");break;
			}
			if(s!=null){
				s.SoundOccur();
				System.out.print("���Ƿ���Ҫ���ڸò����豸����������(Y)��(N),������:");
				char c = scanner.next().charAt(0);
				if(c=='Y'){
					System.out.println("�����������Ӽ���ť��");
					char r = scanner.next().charAt(0);
					if(r=='+')
						s.ChangeVolume('+');
					else if(r=='-')
						s.ChangeVolume('-');
				}
				System.out.println("лл����ʹ�ã�");
			}
		}
	}
}
