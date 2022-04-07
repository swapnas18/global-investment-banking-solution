package loop;

import java.util.HashSet;

public class duplicateelement {

	public static void main(String[] args) {
		String s[]= {"s","w","a","p","n","a","l","i","s","p"};
	 
//		for ( int i=0;i<s.length;i++) {
//			for( int j=i+1;j<s.length;j++) {
//				if(s[i]==s[j] ) {
//					System.out.print(s[i]+" \n");
//				}
//			}
//		}
		HashSet h=new HashSet();

		for(String ss:s) {
			h.add(ss);
		}
		System.out.println(h);
		
		
}}
