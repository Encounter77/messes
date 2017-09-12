package com.leiyuduixiang.ex;

class Fraction {
	int a;
	int b;
	  
	Fraction(int a,int b){                //������
		this.a = a;
		this.b = b;
	}
	double toDouble(){					 //����1
		if(b==0){
			System.out.println("error");
		}
		return 1.0*a/b;
	}
	Fraction plus(Fraction r){			//��ͷ���
		Fraction fraction = new Fraction(1,1);
		fraction.b = r.b*b;
		fraction.a = r.a*b+a*r.b;
		return fraction;
	}
	Fraction multiply(Fraction r){		//�������
		Fraction fraction2 = new Fraction(1,1);
		fraction2.a = a*r.a;
		fraction2.b = b*r.b;
		return fraction2;
	}	
	void print(){						//��ӡ����
		if(a%b==0&&b!=0){
			System.out.println(a/b);
		}else if(b!=0){
			int maxcommon=1;
			int min = (a>b)? b:a;
			for(int i=1;i<=min;i++){	//�����Լ��
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
