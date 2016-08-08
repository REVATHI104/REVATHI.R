public class Revstring {

	public static void main(String[] args)
	{
String s=new String("GooD MoRninG");
String[] str=s.split(" ");
String str1 []=new String[str.length];
for(int m=0;m<str.length;m++)
{
 	
char [] ch=new char[str[m].length()];
int l=0;for(int i=str[m].length()-1;i>=0;i--)
{
ch[l]=str[m].charAt(i);
l++;
}
str1[m]=new String(ch);
}
for(int i=0;i<str.length;i++)
{
	System.out.print(str1[i]+" ");
}
}
}
