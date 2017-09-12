package thursdayex.ex;

public class Test {
	public static void main(String[] args) {
		PhotoGrapher p = new PhotoGrapher();
		Photographable s = new Camera();
		Target g = new Person();
		p.Photograph(s,g);
	}
}
