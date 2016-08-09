
public class Swappp {

	public static void main(String[] args) {
String s[]=args[0].split("");
//System.out.println(s[0]);
//String tmp=s[0];
for(int i=0;i<s.length;i=i+2)
{
	String tmp=s[i];
	s[i]=s[i+1];
	s[i+1]=tmp;
	
}
for(int j=0;j<s.length;j++)
{
	System.out.println(s[j]);
}
	}

}
