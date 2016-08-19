import java.util.Scanner;


public class Asciis {

	public static void main(String[] args) {

	Scanner n=new Scanner(System.in);
	int a=n.nextInt();
	int len=String.valueOf(a).length();
	int b[]=new int[len];
		int j=0;
		char res;
		
		if(a<=26)
		{
	  res=(char)(a+96);
	  System.out.println(res);
		}
		
		else
		{
		while(a!=0)
		{
			b[j]=a%10;
			a=a/10;
			j++;
		}
		char c[]=new char[3];
		for(int i=0;i<len;i++)
		{
			 c[i]=(char)(b[i]+96);
			//System.out.println(c);
		}
		for(int k=len-1;k>=0;k--){
		System.out.println(c[k]);}
	
	}}

}
