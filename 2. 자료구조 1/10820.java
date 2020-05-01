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
import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> arr=new ArrayList();
		Scanner scan=new Scanner(System.in);
		String str="";
		while(scan.hasNextLine()) {
			str=scan.nextLine();
			int a=0;
			int A=0;
			int num=0;
			int blank=0;
			for(int j=0;j<str.length();j++) {
				char temp=str.charAt(j);
				if(Character.isLowerCase(temp)) {
					a++;
				}else if(Character.isUpperCase(temp)) {
					A++;
				}else if(Character.isDigit(temp)){
					num++;
				}else if(temp==' ') {
					blank++;
				}
			}System.out.println(a+" "+A+" "+num+" "+blank);
		}


		
	}

}
