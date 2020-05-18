
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {

	static int arr[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int dp[]=new int[n];
		int cnt=0;

		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		dp[0]=1;
		for(int i=1;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i])
					dp[i]=Math.max(dp[i], dp[j]+1);
			}
			
		}
		int max=0;
		for(int i:dp)
			max=Math.max(max, i);
		
		System.out.println(max);
		
		scan.close();
	}
	
}
