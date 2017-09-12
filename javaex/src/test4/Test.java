package test4;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Manager("Tom",20,5000);
		Employee e2 = new Salesman("Jerry",22,2500,0.15);
		Employee e3 = new Worker("LZ",18,27,120);
		
		System.out.println("Name:"+e1.getName()+" age:"+e1.getAge()+" Wages:"+e1.Wages());
		System.out.println("Name:"+e2.getName()+" age:"+e2.getAge()+" Wages:"+e2.Wages());
		System.out.println("Name:"+e3.getName()+" age:"+e3.getAge()+" Wages:"+e3.Wages());
	}
}
