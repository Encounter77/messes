package java_4.ex2;

public class TestStringBuffer {
	public static void main(String[] args) {
		//StringBuffer s = new StringBuffer(256);
		StringBuffer s2 = new StringBuffer("jyfok");
		
		s2.append("yeah");					//׷������
		System.out.println(s2);
		
		s2.deleteCharAt(2);					//ɾ��ָ��λ�õ��ַ�������2��Ҳ���ǵ������ַ�
		System.out.println(s2);
		
		s2.delete(1,4);						//ɾ��ָ�������ڵ��ַ���[1,4)
		System.out.println(s2);
		
		s2.insert(1,"yf");					//��ָ��λ�ò����ַ����ַ���
		System.out.println(s2);
		
		s2.setCharAt(0, 'J');				//�޸�����indexλ�õ��ַ�
		System.out.println(s2);
		
		s2.reverse();						//��ת�ַ���
		System.out.println(s2);
		
		//ȥ���ַ������˵Ŀո񣬼��ٿռ���˷�
		StringBuffer s3 = new StringBuffer("I am a clever student");
		s3.trimToSize();
		System.out.println(s3);
	}
}
