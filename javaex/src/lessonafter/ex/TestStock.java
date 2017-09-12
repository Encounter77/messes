package lessonafter.ex;

public class TestStock {

	public static void main(String[] args) {
		Stock stock = new Stock("201501","Tencent");
		stock.setPreviousClosingPrice(2500);
		stock.setCurrentPrice(2700);
		System.out.println(stock.getCode());
		System.out.println(stock.getName());
		System.out.println(stock.getPreviousClosingPrice());
		System.out.println(stock.getCurrentPrice());
		System.out.println(stock.getChangePercent());
	}

}
