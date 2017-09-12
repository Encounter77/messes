package mvc.ex;

public class Model_Bean {
	
	private double height;
	private double weight;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Model_Bean(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public double bmldata(){
		return weight/(height*height);
	}
	
	public String bmlresult() {
		double data = this.bmldata();
		if(data >= 18.5 && data <= 25){
			return "体重在正常范围";
		}else if(data > 25 && data <= 30){
			return "体重状况为超重";
		}else if(data > 30){
			return "体重状况为较肥胖";
		}else{
			return "体重状况为偏瘦";
		}
	}
	
}
