package test1;

import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n>=3&&n<=100){
		int sumX,sumO;				//�������1����0�Ĵ���
		int c1=0,c2=0;				//��ǻ�ʤ��һ��
		boolean flag = false;
		//�����ж�������4��������֮��Ĺ�ϵ�ǲ��еģ������и���Ǳ���flag
		
		int[][] chess = new int [n][n];			
		
		for(int i=0;i<chess.length;i++){			//�������ݴ����ά����
			for(int j=0;j<chess[i].length;j++){
				chess[i][j] = scanner.nextInt();
			}		
		}
		//�ж���
		if(!flag){
			for(int i=0;i<chess.length;i++){
				sumX = 0;
				sumO = 0;					//ÿ��һ���ж��궼��Ҫ��ʼ��
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
					break;					//���������жϳ���ʤ���������ɺ��������forѭ��
				}
				if(sumO == n){
					c2=1;
					flag = true;
					break;
			    }		
			}			
		}
		//�ж���
		if(!flag){
			for(int i=0;i<chess.length;i++){
				sumX = 0;
				sumO = 0;						//ÿ��һ���ж��궼��Ҫ��ʼ��
				for(int j=0;j<chess[i].length;j++){
					if(chess[j][i]==1){			//***ע���±�***
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
		//�ж����Խ���
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
		//�жϸ��Խ���
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
/* �������Ŀ�У�ֵ��ע��ĵط�����flag�����ǽ�����Ϊ�˲����ж������ı�ǣ�Ҳ����˵���ǵĳ������һ���ж�����
 * ����������¹ر������ж���������ڣ�����ʵ���˻�ʤ��������һ���ɡ�
 * */
 