import java.util.Scanner;

public class CountWordsInSent {
	int isCheckCount(String s1,String s2){
		char ch1[]= s1.toCharArray();
		char ch2[]=s2.toCharArray();int count=0;
		for(int i=0;i<ch1.length;i++){
			int j=0,k=i;
			while(j<ch2.length&&k<ch1.length&&ch1[k]==ch2[j]){
				j++;
				k++;
			}
			if(j==ch2.length){
				 count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		CountWordsInSent sw= new CountWordsInSent();
		System.out.println("enter the sentence");
		String s1= s.nextLine();
		System.out.println("enter the word");
		String s2= s.nextLine();
		int ct=sw.isCheckCount(s1, s2);
		System.out.println(ct);
	}
}
