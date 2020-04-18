import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		Stack left=new Stack();
		Stack right=new Stack();
		
		int cnt=Integer.parseInt(br.readLine());
		
		//문자열 하나씩 문자로 분리해 배열에 넣기
		for (int i=0;i<str.length();i++) {
			left.push(str.charAt(i));
		}
		
		for(int i=0;i<cnt;i++) {
			String com=br.readLine();
			if(com.startsWith("P")) {
				left.push(com.charAt(2));
			}else if(com.equals("D")) {
				if(!right.isEmpty()) {
					left.push(right.pop());
				}
			}else if(com.equals("L")) {
				if(!left.isEmpty()) {
					right.push(left.pop());
				}
			}else if(com.equals("B")){
				if(!left.isEmpty()) {
					left.pop();
				}
			}
			
		}
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		while(!right.isEmpty()) {
			System.out.print(right.pop());
		}
		
		
	}

}
