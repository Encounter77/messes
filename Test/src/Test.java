
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("1.txt");
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		Scanner scanner = new Scanner(System.in);
		int arr [] = new int [51];
		int n = scanner.nextInt();
		for(int i=0;i<n;i++){
			int value = scanner.nextInt();
			arr[value]++;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				System.out.println(i+":"+arr[i]);
			}
		}
		scanner.close();
	}
}
