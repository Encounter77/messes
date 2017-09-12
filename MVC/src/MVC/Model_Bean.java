package MVC;

public class Model_Bean {
	private double hight;
	private double weight;
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Model_Bean(double hight, double weight) {
		this.hight = hight;
		this.weight = weight;
	}
	public double bmiResult(){
		return weight/(hight*hight);
	}
	public String result(){
		double BMI = this.bmiResult();
		if(BMI >= 18.5 && BMI <= 25){
			return "体重在正常范围";
		}else if(BMI > 25 && BMI <= 30){
			return "体重状况为超重";
		}else if(BMI > 30){
			return "体重状况为较肥胖";
		}else{
			return "体重状况为偏瘦";
		}
	}
}
