package ex;

public class Yunsuan {
	private String shuzi1;
	private String fuhao;
	private String shuzi2;

	public Yunsuan() {
		// TODO Auto-generated constructor stub
	}

	public void yunsuan(String s1,String s2) {
		double ss1 = Double.parseDouble(s1);
		double ss2 = Double.parseDouble(s2);
		if (this.fuhao.equals("+")) {
			jia(ss1,ss2);
		} else if (this.fuhao.equals("-")) { 
			jian(ss1,ss2);
		} else if (this.fuhao.equals("*")) {
			cheng(ss1,ss2);
		} else if (this.fuhao.equals("/")) {
			chu(ss1,ss2);
		}
	}

	public String getShuzi1() {
		return shuzi1;
	}

	public void setShuzi1(String shuzi1) {
		this.shuzi1 = shuzi1;
	}

	public String getFuhao() {
		return fuhao;
	}

	public void setFuhao(String fuhao) {
		this.fuhao = fuhao;
	}

	public String getShuzi2() {
		return shuzi2;
	}

	public void setShuzi2(String shuzi2) {
		this.shuzi2 = shuzi2;
	}

	private double jia(double ss1, double ss2) {
		return ss1 + ss2;
	}
	private double jian(double ss1, double ss2) {
		return ss1 - ss2;
	}
	private double cheng(double ss1, double ss2) {
		return ss1 * ss2;
	}
	private double chu(double ss1, double ss2) {
		return ss1 / ss2;
	}
}
