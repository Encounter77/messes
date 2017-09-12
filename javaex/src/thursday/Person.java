package thursday;

public class Person {
	private String name;
	 int age;
	
	 
	 public Person(String name,int age){
		 this.name = name;
		 this.age = age;
	 }
	 
	 
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String show(){
		return "name="+name+","+"age="+age;
	}
}
