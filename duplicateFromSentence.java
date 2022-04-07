package loop;

import java.util.LinkedHashSet;

public class duplicateFromSentence {

	public static void main(String[] args) {
		String s= "i am swapnali shindesssss";
//String s1=s.replace(" " ,"");
	LinkedHashSet<Character> h= new LinkedHashSet<Character>(); 
for (int i=0;i<s.length();i++)	{
	h.add(s.charAt(i));

}for(Character c:h) {
	System.out.print(c +",");
}
	    

	}}

