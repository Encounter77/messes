package thursday;

public class Test {
	public static void main(String[] args) {
		Student stu = new Student("bbb",25,"xxxx");
		Person per = new Person("aaa",18);
		//stu.setName("Tom"); 
		//stu.name = "Xxx"; 
		//stu.age = 20;
		//stu.school = "QDGXY";
		//stu.shout();
		
		//per.setName("Jerry");
		//per.age = 18;
		//per.school = "xxx";	
		
		System.out.println(per.show());
		System.out.println(stu.show());
	}
}
