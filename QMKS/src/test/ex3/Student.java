package test.ex3;

public class Student extends People {
	private String sno;

	public Student() {

	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public void study() {
		System.out.println("student can study!");
	}

	@Override
	public void eat() {
		System.out.println("student can eat!");
	}

	public void speak() {
		System.out.println("student can speak!");
	}

}
