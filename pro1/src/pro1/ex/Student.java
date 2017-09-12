package pro1.ex;

public class Student extends Person{
	private String school;
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public String show() {
		// TODO Auto-generated method stub
		return  super.show()+" "+"school="+school;
	}
}
