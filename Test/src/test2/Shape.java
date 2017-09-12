package test2;

public abstract class Shape {
	abstract double getArea();
	public int CompareArea(double a1,double a2) {
		if(a1>a2)
			return 1;
		else
			return -1;
	}
}
