package java_4.ex2;

public class TestStringBuffer {
	public static void main(String[] args) {
		//StringBuffer s = new StringBuffer(256);
		StringBuffer s2 = new StringBuffer("jyfok");
		
		s2.append("yeah");					//追加内容
		System.out.println(s2);
		
		s2.deleteCharAt(2);					//删除指定位置的字符，索引2，也就是第三个字符
		System.out.println(s2);
		
		s2.delete(1,4);						//删除指定区间内的字符，[1,4)
		System.out.println(s2);
		
		s2.insert(1,"yf");					//从指定位置插入字符或字符串
		System.out.println(s2);
		
		s2.setCharAt(0, 'J');				//修改索引index位置的字符
		System.out.println(s2);
		
		s2.reverse();						//翻转字符串
		System.out.println(s2);
		
		//去掉字符串两端的空格，减少空间的浪费
		StringBuffer s3 = new StringBuffer("I am a clever student");
		s3.trimToSize();
		System.out.println(s3);
	}
}
