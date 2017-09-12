package circle.ex;

public class TestCircle {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Circle circle = new Circle(4);
		//Circle c = new Circle(2);				
		Circle.setPI(3.1415926);					//调用静态方法
		System.out.println(Circle.count());			//调用统计圆对象个数静态方法
		System.out.println(circle.getLength());
		System.out.println(circle.getArea());
	}

}
