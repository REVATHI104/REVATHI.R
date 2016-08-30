import java.util.Arrays;
import java.util.Scanner;


public class larg {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter input : ");
		String str[]=new String[3];
	
		for(int i=0;i<3;i++)
		{
	 str[i]=in.next();
		}
		Arrays.sort(str);
		System.out.println(str[str.length-1]);

}
}

