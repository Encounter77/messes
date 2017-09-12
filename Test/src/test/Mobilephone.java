package test;

public class Mobilephone extends Telephone {
	private String nettype;
	private double callingtime;
	private double calledtime;
	
	public Mobilephone(String pbrand,String pnumber,double prate,String nettype,double callingtime,double calledtime) {
		// TODO Auto-generated constructor stub
		super(pbrand,pnumber,prate);
		this.nettype = nettype;
		this.calledtime = calledtime;
		this.callingtime = callingtime;
	}
	
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return (callingtime+0.5*calledtime)*super.getPrate();
	}

	public String getNettype() {
		return nettype;
	}

	public double getCallingtime() {
		return callingtime;
	}

	public double getCalledtime() {
		return calledtime;
	}
}
