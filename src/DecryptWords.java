import java.util.Scanner;

public class DecryptWords {
	String decrypt(String str){
		char ch[]=str.toCharArray();
		str="";
		for(int i=0;i<ch.length;i++){
			int no=0;
			while(i<ch.length&&ch[i]>='0'&&ch[i]<='9'){
				no=no*10+(ch[i])-48);
				i++;
			}
			while(no>0){
				str= str+ch[i];
				no--;
			}
		}
		return str;
	}
public static void main(String[] args) {
	DecryptWords dw= new DecryptWords();
	Scanner s= new Scanner(System.in);
	System.out.println("enter the string ");
	String str= s.nextLine();
	
	String  n=dw.decrypt(str);
	System.out.println(n);
	s.close();
}
}
