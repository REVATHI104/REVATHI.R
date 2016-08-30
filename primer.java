import java.util.Scanner;


public class primer {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter input : ");
		String str=in.next();
		if(str.equalsIgnoreCase("a")||str.equalsIgnoreCase("e")||str.equalsIgnoreCase("i")||str.equalsIgnoreCase("o")||str.equalsIgnoreCase("u"))
		{
			System.out.println("VOWELS");
		}
		else
		{
			System.out.println("CONSONANTS");
		}
	}

}
