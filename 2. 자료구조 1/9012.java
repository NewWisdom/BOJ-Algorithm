import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int cnt=scan.nextInt();
		
		for(int i=0;i<cnt;i++) {
			boolean vps;
			int stack=0;
			String str=scan.next();
			for(int j=0;j<str.length();j++) {
				if(stack<0) {
					vps=false;
					break;
				}
	
				if(str.charAt(j)=='(')
					stack++;
				else
					stack--;
			
			}
			if(stack==0)
				vps=true;
			else
				vps=false;
			System.out.println(vps?"YES":"NO");
			
		}	
	}

}
