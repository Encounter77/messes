package cc.cc;

import java.util.Calendar;

public class Date implements Birthday {
	int year;
	int month;
	int date;
	public Date(int a,int b,int c){
		this.date=a;
		this.month=b;
		this.year=c;
	}
	@Override
	public void week() {
		// TODO Auto-generated method stub
		Calendar c1 = Calendar.getInstance();
		//c1.set(year, month, date);
		int day = c1.get(Calendar.DAY_OF_WEEK);
		System.out.println("����"+day);
	}

	@Override
	public void Leapyear() {
		// TODO Auto-generated method stub

        Calendar c2 = Calendar.getInstance();
        int year = c2.get(Calendar.YEAR);
        if(year%4==0&&year%100!=0||year%400==0)
        	System.out.println("����");
        else
        	System.out.println("ƽ��");
	}

	/**
	 * @param args
	 */
	

}
