import java.util.Scanner;

public class EncryptWords {
	String encrypt(String str){
		char ch[]=str.toCharArray();
		str="";
		for(int i=0;i<ch.length;i++){
			int count=1;
			while(i<ch.length-1&&ch[i]==ch[i+1]){
				count++;
				i++;
			}
			str= str+count+ch[i];
		}
		return str;
	}
public static void main(String[] args) {
	EncryptWords cw= new EncryptWords();
	Scanner s= new Scanner(System.in);
	System.out.println("enter the string ");
	String str= s.nextLine();
	
	String  n=cw.encrypt(str);
	System.out.println(n);
	s.close();
}
}
