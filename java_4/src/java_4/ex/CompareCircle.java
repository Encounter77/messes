package java_4.ex;
/*
 * 定义CompareCircle类，继承Circle类
 * 并实现CompareObject的接口
 * 
 * 
 * */
public  class CompareCircle extends Circle implements CompareObject{

	public CompareCircle(double radius) {
		super(radius);
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		if(o instanceof Circle){
			Circle c = (Circle) o ;
			return (int)(this.getRadius()-c.getRadius());
		}
		return 0;
	}
}
