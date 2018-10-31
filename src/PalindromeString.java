import java.util.Scanner;

public class PalindromeString {
static boolean	isPalindrome(String str){
	int i=0;
	while(i<str.length()/2){
		if(str.charAt(i)!=str.charAt(str.length()-1-i))
			return false;
		i++;
		
			
	}
	return true;
}
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the string ");
	String str= s.next();
	boolean rs= isPalindrome(str);
	if(rs)
		System.out.println(str+"  is palindrome");
	else 
		System.out.println(str+"  is palindrome");
}
}

