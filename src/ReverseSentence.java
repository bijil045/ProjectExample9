import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.nextLine();
		char ch[]=st.toCharArray();
		st="";
		for(int i=ch.length-1;i>=0;i--){
			int k=i;
			while(i>=0&&ch[i]!=' '){
				i--;
						}
			int j=i+1;
			while(j<=k){
				st=st+ch[j];
				j++;
						}
			if(i>=0){
				st=st+ch[i];
			}
		}
		System.out.println(st);
	}
}
