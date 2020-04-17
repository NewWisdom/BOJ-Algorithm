import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		boolean isStart =true;
		Stack stick =new Stack();
		int lager=0;
		int sum=0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				stick.push('(');
			}else {
				if(str.charAt(i-1)=='(') { //레이저
					stick.pop();
					sum+=stick.size();
				}else { // 막대기의 끝
					stick.pop();
					sum++;
				}
			}
		}
		System.out.println(sum);
		
		
	}

}
