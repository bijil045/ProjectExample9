import java.util.*;
public class CountWords {
	int countWords(String str){
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			if((i==0&&ch[i]!=' ')||(ch[i]!=' '&&ch[i-1]==' '))
				count++;
		}
		return count;
	}
public static void main(String[] args) {
	CountWords cw= new CountWords();
	Scanner s= new Scanner(System.in);
	System.out.println("enter the string ");
	String str= s.nextLine();
	
	int n=cw.countWords(str);
	System.out.println(n);
	s.close();
}
}
