package test.ex3;

public class People {
	private String name;
	private String sex;
	private int age;

	public People() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("people can eat!");
	}

	public void speak() {
		System.out.println("people can speak!");
	}
}
