import java.util.Scanner;


public class numstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String str=s.nextLine();
		System.out.println("Enter the string 2: ");
		String str1=s.nextLine();
		System.out.println("No.of times the first string to repeat: ");
		int n=s.nextInt();
		System.out.println("No.of times the second string to repeat: ");
		int n1=s.nextInt();
		String res1=" ";
		String res2=" ";
		for(int i=1;i<=n;i++)
		{
		 res1=res1+str;
		}
		for(int i=1;i<=n1;i++)
		{
		 res2=res2+str1;
		}
		System.out.println(res1+res2);
	}

}
