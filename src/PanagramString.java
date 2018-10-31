import java.util.Scanner;

public class PanagramString {
	static int[] countAlph(String str1) {
		 int count[]=new int[26];
			for(int i=0;i<str1.length();i++){
				int ch=str1.charAt(i);
				if(ch>='A'&&ch<='Z')
					count[ch-65]++;
				
				else if(ch>='a'&&ch<='z')
					count[ch-97]++;
						}
			return count;
			
		}
	
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the first string ");
	String str= s.next();
	
	boolean rs= isPanagram(str);
	if(rs)
		System.out.println(" is panagram");
	else 
		System.out.println(" is not panagram");
}

private static boolean isPanagram(String str) {
	int c1[]=	countAlph(str);
	return false;
}
}

