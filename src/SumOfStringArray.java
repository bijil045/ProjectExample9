import java.util.*;
public class SumOfStringArray {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the string ");
	String str= s.next();
	
	int sum=0;
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
	if(ch>='0'&&ch<='9'){
		sum=sum+ch-48;
	}
	System.out.println(sum);
	}
	}
}

