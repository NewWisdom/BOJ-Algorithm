
import java.util.Scanner;



public class Main {

	static int arr[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int arr[]=new int[1001];
		int dp[]=new int[10001];

		for(int i=1;i<=n;i++) {
			arr[i]=scan.nextInt();
		}
		dp[1]=arr[1];
		for(int i=2;i<=n;i++) {
			dp[i]=arr[i];
			for(int j=0;j<i;j++) {
				dp[i]=Math.max(dp[i],dp[i-j]+dp[j]);
			}
		}
		System.out.println(dp[n]);

		
		

	}
	
}
