package java_4.ex2;

public class TestString {
	public static void main(String[] args) {
		String str = "jiangyanfei";					//串池存储,引用指向
		String str2 = new String("姜yanfei");		//堆内存储
		
		System.out.println(str.length());			//length方法,返回字符串长度
		System.out.println(str2.length());			//汉字占一个字符长度
		
		String str3 = "jiangyanfei";
		String str4 = new String("jiangyanfei");
		
		int result = str.compareTo(str3);			//比较两个字符串是否相同，相同返回0，
		System.out.println(result);					//1>2 返回多出的字符数(正数)
		int result2 = str.compareTo(str4);			
		System.out.println(result2);				//1<2 返回少出的字符数(负数)
		
		boolean result3 = str.equals(str3);			//equals比较内容是否相同
		boolean ans = (str==str3);					//比较两个字符串对象在内存中的地址是否一样
		System.out.println(result3+" "+ans);
		boolean result4 = str.equals(str4);
		boolean ans1 = (str==str4);
		System.out.println(result4+" "+ans1);
		
		int idx = str.indexOf("f");					//查找字符在字符串中的位置(0开始)
		System.out.println(idx+1);
		int idx1 = str.indexOf("an");				//查找子串在字符串中的起始位置(0开始)
		System.out.println(idx1+1);
		int idx2 = str.indexOf("n",4);				//从第五个字符(下标4)开始查询字符n的位置 
		System.out.println(idx2+1);
		
		String str5 = str.substring(0, 5);			//截取子串，从第二个位置开始，到第五个位置
		System.out.println(str5);
		
		String str6 = "Oracle,MySql,SqlSever,DB2";
		String[] strn = str6.split(",");			//分割字符串(分隔符,限制条件)
		System.out.println(strn.length);			//分割后的长度不定,根据参数决定
		for(int i=0;i<strn.length;i++){				//分割后用字符串数组存储
			System.out.println(strn[i]);	
		}
		//分割的时候可能会遇到特殊字符，需要转译。
		//转义字符 "//"
		//e.g  以"."为分隔符, sqlit("//.")
		//多个分隔符，用|连接。
		//e.g sqlit("//.|i")
		
		int num = 123456;
		String s = String.valueOf(num);				//int转换String
		System.out.println(s.length());				//判断数字位数
	}
}
