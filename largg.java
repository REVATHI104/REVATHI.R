import java.util.Arrays;
import java.util.Scanner;


public class largg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter String:");
		String str=s.next();
		StringBuffer i=new StringBuffer(str);
		StringBuffer r=i.reverse();	
		System.out.println("rev is:"+r);

}
}


