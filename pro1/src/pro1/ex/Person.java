package pro1.ex;

public class Person {
	private String name;
	private String sex;
	public int age;				//**

	public String getName() {
		return name;
	}
	
	public String getSex() {
		return sex;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String show(){
		return "name="+name+" "+"sex="+sex+" "+"age="+age;
	}
}
