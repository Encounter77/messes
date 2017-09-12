package com.leiyuduixiang.ex;

class Fraction {
	int a;
	int b;
	  
	Fraction(int a,int b){                //构造器
		this.a = a;
		this.b = b;
	}
	double toDouble(){					 //方法1
		if(b==0){
			System.out.println("error");
		}
		return 1.0*a/b;
	}
	Fraction plus(Fraction r){			//求和方法
		Fraction fraction = new Fraction(1,1);
		fraction.b = r.b*b;
		fraction.a = r.a*b+a*r.b;
		return fraction;
	}
	Fraction multiply(Fraction r){		//求积方法
		Fraction fraction2 = new Fraction(1,1);
		fraction2.a = a*r.a;
		fraction2.b = b*r.b;
		return fraction2;
	}	
	void print(){						//打印方法
		if(a%b==0&&b!=0){
			System.out.println(a/b);
		}else if(b!=0){
			int maxcommon=1;
			int min = (a>b)? b:a;
			for(int i=1;i<=min;i++){	//求最大公约数
				if(a%i==0&&b%i==0){
					maxcommon = i;
				}
			}
			System.out.println(a/maxcommon+"/"+b/maxcommon);
		}else{
			System.out.println(a+"/"+b);
		}
	}
}
