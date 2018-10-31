import java.util.*;

public class CountLettterDigitsSpecChar {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the string ");
	String str= s.next();
	int vc=0,cc=0,uc=0,lc=0,sc=0,dc=0;
	for(int i=0;i<str.length();i++){
		int ch=str.charAt(i);
		if(ch>='A'&&ch<='Z'){
			uc++;
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				vc++;
			}
			else{
				cc++;
			}
		}
			if(ch>='a'&&ch<='z'){
				uc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
					vc++;
				}
				else{
					cc++;
				}
			}
			else if(ch>='0'&&ch<='9')
				dc++;
			else
				sc++;
	}
	System.out.println("capital letter:"+uc);
	System.out.println("small letter:"+lc);
	System.out.println("capital letter:"+);
	System.out.println("capital letter:"+);
	System.out.println("capital letter:"+);
}
}
