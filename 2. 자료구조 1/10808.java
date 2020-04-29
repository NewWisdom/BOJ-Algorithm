import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char charArr[]={'a','b','c','d','e','f','g','h','i','j','k','l',
	            'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int intArr[]=new int[26];
		for(int i=0;i<intArr.length;i++) {
			intArr[i]=0;
		}
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<charArr.length;j++) {
				if(str.charAt(i)==charArr[j]) {
					intArr[j]++;
				}
			}
		}
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i]+" ");
		}
	}

}
