public class Odd {

	
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		if(n>0)
		{
			System.out.println("The number is positive");
		}
		else if(n<0)
		{
			System.out.println("The number is negative");
		}
		else if(n==0)
		{
			System.out.println("The number is zero");
		}
		else
		{
			System.out.println("Invalid number");
		}
		
	}

}
