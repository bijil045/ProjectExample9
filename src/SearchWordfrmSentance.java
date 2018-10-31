import java.util.*;
public class SearchWordfrmSentance {
	boolean isCheck(String s1,String s2){
		char ch1[]= s1.toCharArray();
		char ch2[]=s2.toCharArray();
		for(int i=0;i<ch1.length;i++){
			int j=0,k=i;
			while(j<ch2.length&&k<ch1.length&&ch1[k]==ch2[j]){
				j++;
				k++;
			}
			if(j==ch2.length){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		SearchWordfrmSentance sw= new SearchWordfrmSentance();
		System.out.println("enter the sentence");
		String s1= s.nextLine();
		System.out.println("enter the word");
		String s2= s.nextLine();
		boolean b=sw.isCheck(s1, s2);
		if(b)
			System.out.println("word is present:");
		else
			System.out.println("word is not present:");
	}
}
