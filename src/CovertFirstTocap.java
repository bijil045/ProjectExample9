import java.util.Scanner;

public class CovertFirstTocap {
	String convertCapital(String str){
		char ch[]=str.toCharArray();
			for(int i=0;i<ch.length;i++){
			if((i==0&&ch[i]!=' ')||(ch[i]!=' '&&ch[i-1]==' '))
			{
				if(ch[i]>='a'&&ch[i]<='z'){
					ch[i]=(char)(ch[i]-32);
				}
			}
			else{
				if(ch[i]>=65&&ch[i]<=90){
					ch[i]=(char)(ch[i]+32);
			}
			}
			}
				return str=new String(ch);
			 
	}
public static void main(String[] args) {
	CovertFirstTocap cw= new CovertFirstTocap();
	Scanner s= new Scanner(System.in);
	System.out.println("enter the string ");
	String str= s.nextLine();
	
	String n=cw.convertCapital(str);
	System.out.println(n);
	s.close();
}
}
