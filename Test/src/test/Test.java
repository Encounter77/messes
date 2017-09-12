package test;

public class Test {
	public static void main(String[] args) {
		Telephone tel = new Telephone("TCL","8309600",150.0,0.2);
		Mobilephone mob = new Mobilephone("Nokia","13007091010",0.4,"CDMA",0.0,120.0);
		
		System.out.println("电话品牌："+tel.getPbrand()+" "+"电话号码："+tel.getPnumber());
		System.out.println("通话时间："+tel.getPtime()+" "+"费率："+tel.getPrate());
		System.out.println("话费："+tel.pay());
		System.out.println();
		System.out.println("电话品牌："+mob.getPbrand()+" "+"电话号码："+mob.getPnumber()+" "+"网络："+mob.getNettype());
		System.out.println("主叫时间："+mob.getCallingtime()+" "+"被叫时间："+mob.getCalledtime()+" "+"费率："+mob.getPrate());
		System.out.println("话费："+mob.pay());
	}
}
