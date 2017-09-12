package thursday;

public class Student extends Person{
	String school;	
	
	
	public Student (String name,int age,String school){
		super(name,age);
		this.school = school;
	}
	
	
	public void shout(){
		
		System.out.println("I am a clever Student !");
	}
	
	
	public String show(){
		return "name="+getName()+","+"age="+age+","+"school="+school;
	}
	
}
