import java.util.Scanner;


public class Index {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the number of value : ");
		int s=n.nextInt();
		int a[]=new int[s];
		System.out.println("Enter the values one by one : ");
		for(int i=0;i<s;i++)
		{
			a[i]=n.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==i)
			{
				System.out.println("The value same as index is :"+a[i]);
			}
		}
	}

}
