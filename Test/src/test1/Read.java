package test1;


import java.util.Scanner;

public class Read {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String str = String.valueOf(num);//����������ת��Ϊ�ַ���
		char[] c = str.toCharArray();//���ַ���ת��Ϊ�ַ�����
		for(int i=0;i<c.length-1;i++){
			switch(c[i]){
			case '1':System.out.print("yi ");break;
			case '2':System.out.print("er ");break;
			case '3':System.out.print("san ");break;
			case '4':System.out.print("si ");break;
			case '5':System.out.print("wu ");break;
			case '6':System.out.print("liu ");break;
			case '7':System.out.print("qi ");break;
			case '8':System.out.print("ba ");break;
			case '9':System.out.print("jiu ");break;
			case '0':System.out.print("ling ");break;
			default:System.out.print("fu ");break;
			}
		}
		switch(c[c.length-1]){
		case '1':System.out.print("yi");break;
		case '2':System.out.print("er");break;
		case '3':System.out.print("san");break;
		case '4':System.out.print("si");break;
		case '5':System.out.print("wu");break;
		case '6':System.out.print("liu");break;
		case '7':System.out.print("qi");break;
		case '8':System.out.print("ba");break;
		case '9':System.out.print("jiu");break;
		case '0':System.out.print("ling");break;
		}
		scanner.close();
	}
}
