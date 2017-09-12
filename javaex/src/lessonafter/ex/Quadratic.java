package lessonafter.ex;

public class Quadratic {
	private double tco;
	private double oco;
	private double fco;
	
	public Quadratic(double tco,double oco,double fco){
		this.tco= tco;
		this.oco = oco;
		this.fco = fco;
	}
	
	public double compute(){
		double x1=0;
		double k = (oco*oco)-4*tco*fco;
		if(tco!=0&&k>=0){
			x1=(-oco+Math.sqrt(k))/(2*tco);
		}else{
			System.out.println("error result !!");
		}
		return x1;
	}

	public double getTco() {
		return tco;
	}

	public void setTco(double tco) {
		this.tco = tco;
	}

	public double getOco() {
		return oco;
	}

	public void setOco(double oco) {
		this.oco = oco;
	}

	public double getFco() {
		return fco;
	}

	public void setFco(double fco) {
		this.fco = fco;
	}
}
