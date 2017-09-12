public class Test3 {

	public static void main(String args[]) {
		A[] varA = new A[3];
		varA[0] = new B();
		varA[1] = new C();
		varA[2] = new A();
		for (int i = 0; i < 3; i++)
			varA[i].display();
	}
}
