package mondaybc;

public class Test {
	public static void main(String[] args) {
		for(int x = 0;x <= 100 ;x++){
			for(int y = 0;y <= 100;y++){
				if(11*x+11==110+y&&x/10==0){
					System.out.println("方块是"+x+"\n三角是"+y+"\n圆圈是1");
				}
			}
		}
	}
}
