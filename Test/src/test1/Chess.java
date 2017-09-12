package test1;

import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n>=3&&n<=100){
		int sumX,sumO;				//计算出现1或者0的次数
		int c1=0,c2=0;				//标记获胜的一方
		boolean flag = false;
		//由于判断条件有4个，它们之间的关系是并列的，所以有个标记变量flag
		
		int[][] chess = new int [n][n];			
		
		for(int i=0;i<chess.length;i++){			//输入数据存入二维数组
			for(int j=0;j<chess[i].length;j++){
				chess[i][j] = scanner.nextInt();
			}		
		}
		//判断行
		if(!flag){
			for(int i=0;i<chess.length;i++){
				sumX = 0;
				sumO = 0;					//每对一行判断完都需要初始化
				for(int j=0;j<chess[i].length;j++){
					if(chess[i][j]==1){
						sumX++;
					}else{
						sumO++;
					}
				}
				if(sumX == n){
					c1=1;					
					flag = true;
					break;					//满足条件判断出获胜方并标记完成后，跳出外层for循环
				}
				if(sumO == n){
					c2=1;
					flag = true;
					break;
			    }		
			}			
		}
		//判断列
		if(!flag){
			for(int i=0;i<chess.length;i++){
				sumX = 0;
				sumO = 0;						//每对一列判断完都需要初始化
				for(int j=0;j<chess[i].length;j++){
					if(chess[j][i]==1){			//***注意下标***
						sumX++;
					}else{
						sumO++;
					}
				}
				if(sumX == n){
					c1=1;
					flag = true;
					break;
				}
				if(sumO == n){
					c2=1;
					flag = true;
					break;
			    }		
			}			
		}
		//判断主对角线
		if(!flag){
			sumX = 0;
			sumO = 0;		
			for(int i=0;i<chess.length;i++ ){
				if(chess[i][i]==1){
						sumX++;
					}else{
						sumO++;
				}
				if(sumX == n){
					c1=1;
					flag = true;
					break;
				}
				if(sumO == n){
					c2=1;
					flag = true;
					break;
			    }		
			}			
		}
		//判断副对角线
		if(!flag){
			sumX = 0;
			sumO = 0;
			for(int i=0;i<chess.length;i++ ){
				if(chess[i][n-i-1]==1){
						sumX++;
					}else{
						sumO++;
					}
				if(sumX == n){
					c1=1;
					flag = true;
					break;
				}
				if(sumO == n){
					c2=1;
					flag = true;
					break;
			    }		
			}			
		}
		if(c1==1){
			System.out.println("X");
		}else if(c2==1){
			System.out.println("O");
		}else{
			System.out.println("NIL");
		}
		scanner.close();
		}
	}
}
/* 在这个题目中，值得注意的地方就是flag，我们将它作为了并列判断条件的标记，也就是说我们的程序会在一个判断条件
 * 满足的条件下关闭其他判断条件的入口，真正实现了获胜的条件有一即可。
 * */
 