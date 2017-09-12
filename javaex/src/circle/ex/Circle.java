package circle.ex;
/*
  	1.����һ��Circle�࣬����Circle�������뾶����Բ��������ܳ�
	����һ��������TestCircle����֤Circle��
	2. ��дһ��Բ��Circle��������Բ���ʣ��뾶��Բ���������
	����Բ���ʺ�Բ�������Ϊstatic��Ա��
	���⣬Circle�л�������static�����ֱ���
	����Բ���ʺ���ʾ��ǰԲ��������ģ�
	���඼��ʵ����Ա�������ʵ�飩��
 */
public class Circle {
	private double radius;
	private static double PI=3.14;  				//��̬��Ա
	private static int cnt=0;
	
	public Circle(double radius){
		this.radius = radius;
		cnt++;
	}
	
	public static void setPI(double p) {			//��̬����Բ���ʷ���
		PI = p;
	}
	
	public static int count(){
		return cnt;
	}
	
	public double getArea(){
		return PI*radius*radius;
	}
	
	public double getLength(){
		return 2*PI*radius;
	}
}
