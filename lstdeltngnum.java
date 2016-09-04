import java.util.Arrays;
import java.util.Scanner;


public class lstdeltngnum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Give the input number :");
		String str=in.next();
		//int n=args[0];
		int[] num=new int[str.length()];
		int sn=Integer.parseInt(str);
		int c;
		int i=0;
		while(sn>0)
		{
			c=sn%10;
			num[i]=c;
			sn=sn/10;
			i++;
		}
		Arrays.sort(num);
		System.out.println("Give the num of dig to del :");
		int h=in.nextInt();
		System.out.println("Least num :");
		for(int j=0; j<num.length-h;j++)
		{
			System.out.print(num[j]);
		}
		
		

		
		
		
		
		
		
		
		
		
		

	}

}
