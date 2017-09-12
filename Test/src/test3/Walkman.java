package test3;

public class Walkman implements Soundable{

	@Override
	public void SoundOccur() {
		System.out.println("Hello,I am a Walkman!");
	}

	@Override
	public void ChangeVolume(char flag) {
		if(flag=='+')
			System.out.println("Now,Walkman will add volume!");
		else if(flag=='-')
			System.out.println("Now,Walkman will reduce volume!");
		
	}
	
}
