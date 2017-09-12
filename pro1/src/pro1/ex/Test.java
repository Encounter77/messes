package pro1.ex;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		
		p.setName("Jerry");
		p.setSex("girl");
		p.age = 18;
		
		s.setName("Tom");
		s.setSex("boy");
		s.age = 20;
		s.setSchool("QDGXY");
		
		System.out.println(s.getName());
		System.out.println(s.getSex());
		System.out.println(s.age);
		System.out.println(s.show());
		
		System.out.println(p.show());
		
		
		
	}
}
