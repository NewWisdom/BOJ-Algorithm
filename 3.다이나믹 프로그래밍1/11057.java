
import java.util.Scanner;



public class Main {

	static int arr[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long dp[][]=new long[1001][11];
		
		for(int i=0;i<=9;i++) {
			dp[1][i]=1;
		}

		for(int i=2;i<=n;i++) {
			for(int j=0;j<=9;j++) {
				for(int k=0;k<=j;k++) {
					dp[i][j]=(dp[i][j]+dp[i-1][k])%10007;
				}
			
			
				
			}
		}

		long sum=0;
		for(int i=0;i<10;i++) {
			sum+=dp[n][i];
		}
		System.out.println(sum%10007);

	}
	
}
