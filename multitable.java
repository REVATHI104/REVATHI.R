import java.util.Scanner;


public class multitable {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int last=in.nextInt();
int table[]=new int[last];
for(int i=0;i<last;i++)
{
	table[i]=(i+1)*n;
}
for(int j=0;j<last;j++)
{
	System.out.println(table[j]);
}

	}

}
