package lessonafter.ex;

public class Location {
	private int x;
	private int y;
	private double [][] shopL = new double[x][y];
	private double minD;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double[][] getShopL() {
		return shopL;
	}

	public void setShopL(double[][] shopL) {
		this.shopL = shopL;
	}

	public Location(int x,int y) {
		// TODO 自动生成的构造函数存根
		this.x = x;
		this.y = y;
	}
	
	
	public Location locationNearest(Location Mylocation){
		double min = 5;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				minD = Math.sqrt((x-i)*(x-i)-(y-j)*(y-j));
				if(minD<min){
					x=i;
					y=j;
				}
			}
		}
		return Mylocation;
	}

	public double getMinD() {
		return minD;
	}

	public void setMinD(double minD) {
		this.minD = minD;
	}
}
