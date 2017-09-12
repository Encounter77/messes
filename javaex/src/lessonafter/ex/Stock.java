package lessonafter.ex;

public class Stock {
	private String code;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String code,String name){
		this.code = code;
		this.name = name;
	}
	
	public double getChangePercent(){
		return (currentPrice-previousClosingPrice)/previousClosingPrice;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	
}
