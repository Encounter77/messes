package java_4.ex2;

public class TestString {
	public static void main(String[] args) {
		String str = "jiangyanfei";					//���ش洢,����ָ��
		String str2 = new String("��yanfei");		//���ڴ洢
		
		System.out.println(str.length());			//length����,�����ַ�������
		System.out.println(str2.length());			//����ռһ���ַ�����
		
		String str3 = "jiangyanfei";
		String str4 = new String("jiangyanfei");
		
		int result = str.compareTo(str3);			//�Ƚ������ַ����Ƿ���ͬ����ͬ����0��
		System.out.println(result);					//1>2 ���ض�����ַ���(����)
		int result2 = str.compareTo(str4);			
		System.out.println(result2);				//1<2 �����ٳ����ַ���(����)
		
		boolean result3 = str.equals(str3);			//equals�Ƚ������Ƿ���ͬ
		boolean ans = (str==str3);					//�Ƚ������ַ����������ڴ��еĵ�ַ�Ƿ�һ��
		System.out.println(result3+" "+ans);
		boolean result4 = str.equals(str4);
		boolean ans1 = (str==str4);
		System.out.println(result4+" "+ans1);
		
		int idx = str.indexOf("f");					//�����ַ����ַ����е�λ��(0��ʼ)
		System.out.println(idx+1);
		int idx1 = str.indexOf("an");				//�����Ӵ����ַ����е���ʼλ��(0��ʼ)
		System.out.println(idx1+1);
		int idx2 = str.indexOf("n",4);				//�ӵ�����ַ�(�±�4)��ʼ��ѯ�ַ�n��λ�� 
		System.out.println(idx2+1);
		
		String str5 = str.substring(0, 5);			//��ȡ�Ӵ����ӵڶ���λ�ÿ�ʼ���������λ��
		System.out.println(str5);
		
		String str6 = "Oracle,MySql,SqlSever,DB2";
		String[] strn = str6.split(",");			//�ָ��ַ���(�ָ���,��������)
		System.out.println(strn.length);			//�ָ��ĳ��Ȳ���,���ݲ�������
		for(int i=0;i<strn.length;i++){				//�ָ�����ַ�������洢
			System.out.println(strn[i]);	
		}
		//�ָ��ʱ����ܻ����������ַ�����Ҫת�롣
		//ת���ַ� "//"
		//e.g  ��"."Ϊ�ָ���, sqlit("//.")
		//����ָ�������|���ӡ�
		//e.g sqlit("//.|i")
		
		int num = 123456;
		String s = String.valueOf(num);				//intת��String
		System.out.println(s.length());				//�ж�����λ��
	}
}
