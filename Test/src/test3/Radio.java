package test3;

public class Radio implements Soundable{

	@Override
	public void SoundOccur() {
		System.out.println("Hello,I am a Radio!");
		
	}

	@Override
	public void ChangeVolume(char flag) {
		if(flag=='+')
			System.out.println("Now,Radio will add volume!");
		else if(flag=='-')
			System.out.println("Now,Radio will reduce volume!");
	}
}
