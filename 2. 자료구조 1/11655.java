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

	public static String rot13(String s) {
		String ans="";
		for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'm') {   
                c += 13;   
            } else if (c >= 'n' && c <= 'z') {    
                c -= 13;   
            } else if(c >= 'A' && c <= 'M') { 
                c += 13;   
            } else if(c >= 'N' && c <= 'Z') { 
                c -= 13;   
            }
            ans += c;
        }
        return ans;
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(rot13(s));



		
	}

}
