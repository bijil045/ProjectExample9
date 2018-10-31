import java.util.Scanner;

public class CharCountChar {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string ");
		String str= s.next();
		int count[]=new int[26];
		
		for(int i=0;i<str.length();i++){
			int ch=str.charAt(i);
			//System.out.println(ch);
			
			//int c = 0;
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
			
					}
		
		for(int j=0;j<count.length;j++){
			if(count[j]!=0){
				System.out.println((char)(j+65)+"   -->"+count[j]);
			}
			
		}
		s.close();
	}
}
