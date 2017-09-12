package test4;

public abstract class Employee {
	private String name;
	private int age;
	
	public Employee(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public abstract double Wages();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

