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

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		String a=st.nextToken();
		String b=st.nextToken();
		String c=st.nextToken();
		String d=st.nextToken();
		
		String ab=a.concat(b);
		String cd=c.concat(d);
		
		long sum=Long.valueOf(ab)+Long.valueOf(cd);
		System.out.println(sum);

	}

}
