package circle.ex;

public class TestCircle {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Circle circle = new Circle(4);
		//Circle c = new Circle(2);				
		Circle.setPI(3.1415926);					//���þ�̬����
		System.out.println(Circle.count());			//����ͳ��Բ���������̬����
		System.out.println(circle.getLength());
		System.out.println(circle.getArea());
	}

}
