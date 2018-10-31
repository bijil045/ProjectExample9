import java.util.*;
public class OccuranceCharArray {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the string ");
	String str= s.next();
	int count[]=new int[128];
	for(int i=0;i<str.length();i++){
		int ch=str.charAt(i);
		count[ch]++;
	}
	for(int i=0;i<count.length;i++){
		if(count[i]!=0){
			System.out.println((char)i+"   -->"+count[i]);
		}
		
	}
	s.close();
}
}
