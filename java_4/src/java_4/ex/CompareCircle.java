package java_4.ex;
/*
 * ����CompareCircle�࣬�̳�Circle��
 * ��ʵ��CompareObject�Ľӿ�
 * 
 * 
 * */
public  class CompareCircle extends Circle implements CompareObject{

	public CompareCircle(double radius) {
		super(radius);
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO �Զ����ɵķ������
		if(o instanceof Circle){
			Circle c = (Circle) o ;
			return (int)(this.getRadius()-c.getRadius());
		}
		return 0;
	}
}
