package clock;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(),in.nextInt());
		//while(true){
		clock.tick();
		System.out.println(clock);
		//}
		in.close();
	}

}
