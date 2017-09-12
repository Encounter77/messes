package lessonafter.ex;

public class TestLocation {

	public static void main(String[] args) {
		Location lo = new Location(2,8);
		double [][] array = new double[3][3];
		/*for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				input = scanner.nextInt();
			}
		}*/
		lo.setShopL(array);
		//lo.setX(7);
		//lo.setY(8);
		lo.locationNearest(lo);
		System.out.println(lo.getX()+"  "+lo.getY());
	}
}
