package java_4.ex;

public class Test {
	public static void main(String[] args) {
		CompareCircle cc1 = new CompareCircle(2);
		CompareCircle cc2 = new CompareCircle(2);
		
		//cc1.setRadius(2);
		//cc2.setRadius(2);
		
		System.out.println(cc1.compareTo(cc2));
		
	}
}
