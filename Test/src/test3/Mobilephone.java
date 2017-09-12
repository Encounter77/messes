package test3;

public class Mobilephone implements Soundable{

	@Override
	public void SoundOccur() {
		System.out.println("Hello,I am a Mobilephone!");
	}
	
	@Override
	public void ChangeVolume(char flag) {
		if(flag=='+')
			System.out.println("Now,Mobilephone will add volume!");
		else if(flag=='-')
			System.out.println("Now,Mobilephone will reduce volume!");
	}
	
}
