public class Strrev {
public static void main(String[] args) {
	String[] s=args[0].split("");
	//System.out.println(s[1]);
	for(int i=s.length-1;i>=0;i--)
	{
		System.out.print(s[i]);
	}
}
}
