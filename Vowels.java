import java.util.Scanner;


public class Vowels {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s=in.next();
		StringBuffer str=new StringBuffer(s);
		String res=str.reverse().toString();
		System.out.println(res);
		String a[]=res.split("");
		String b[]=new String[a.length];
		for(int i=0;i<s.length();i++)
		{
			//char ch=s.charAt(i);
			//if(s.charAt(i).equals('i')||s.charAt(i).equals('e')||ch.equals('a')||ch.equals('o')||ch.equals('u'))
			if(a[i].equals("a")||a[i].equals("o")||a[i].equals("u")||a[i].equals("e")||a[i].equals("i"))
			{
				continue;
			}
			else
			{
				b[i]=a[i];
			}
		System.out.println(b[i]);
		
		}
		//for(int k=b.length-1;k>=0;k++)
		//{
			//System.out.println(b[k]);
		//}
		
		
		
	}

}
