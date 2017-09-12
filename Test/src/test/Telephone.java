package test;

public class Telephone {
	private String pbrand;
	private String pnumber;
	private double ptime;
	private double prate;
	
	public Telephone(String pbrand,String pnumber,double ptime,double prate) {
		// TODO Auto-generated constructor stub
		this(pbrand,pnumber,prate);
		this.ptime = ptime;
	}
	
	public Telephone(String pbrand,String pnumber,double prate) {
		// TODO Auto-generated constructor stub
		this.pbrand = pbrand;
		this.pnumber = pnumber;
		this.prate = prate;
	}
	
	public double pay(){
		return ptime*prate;
	}

	public String getPbrand() {
		return pbrand;
	}

	public String getPnumber() {
		return pnumber;
	}

	public double getPtime() {
		return ptime;
	}

	public double getPrate() {
		return prate;
	}
}
