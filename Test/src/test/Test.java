package test;

public class Test {
	public static void main(String[] args) {
		Telephone tel = new Telephone("TCL","8309600",150.0,0.2);
		Mobilephone mob = new Mobilephone("Nokia","13007091010",0.4,"CDMA",0.0,120.0);
		
		System.out.println("�绰Ʒ�ƣ�"+tel.getPbrand()+" "+"�绰���룺"+tel.getPnumber());
		System.out.println("ͨ��ʱ�䣺"+tel.getPtime()+" "+"���ʣ�"+tel.getPrate());
		System.out.println("���ѣ�"+tel.pay());
		System.out.println();
		System.out.println("�绰Ʒ�ƣ�"+mob.getPbrand()+" "+"�绰���룺"+mob.getPnumber()+" "+"���磺"+mob.getNettype());
		System.out.println("����ʱ�䣺"+mob.getCallingtime()+" "+"����ʱ�䣺"+mob.getCalledtime()+" "+"���ʣ�"+mob.getPrate());
		System.out.println("���ѣ�"+mob.pay());
	}
}
