import java.util.*;
public class ReverseWords {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the string");
	String st=s.nextLine();
	char ch[]=st.toCharArray();
	String	str="";
	for(int i=0;i<ch.length;i++){
		int k=i;
		while(i<ch.length&&ch[i]!=' '){
			i++;
					}
		//for(int j=str.length()-1;j>=0;j--){
		//	st=st+ch[j];
	//	}
	int j=i-1;
		while(j>=k){
			str=str+ch[j];
			//System.out.println(st);
			j--;
					}
		if(i<ch.length){
			str=str+ch[i];
	}
	}
	System.out.println(str);
}
}
