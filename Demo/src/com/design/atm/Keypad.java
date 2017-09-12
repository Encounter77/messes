package com.design.atm;

import java.util.Scanner;

public class Keypad {
	
		private Scanner input;

	    //构造函数，初始化input
		public Keypad(){				
				input=new Scanner(System.in);
		}
		
		//从输入流中取得输入的数据
		public int getInput(){
				return input.nextInt();
		}
		
}
