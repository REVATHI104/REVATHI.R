
public class Palin {

	public static void main(String[] args) {
int a=Integer.parseInt(args[0]);
int sum=0;
int rem,rev=0;
int b;
do
{
	b=a%10;
	sum+=b;
	a=a/10;
}
while(a>0);
System.out.println("sum is "+sum);


int num=sum;
while(num>0)
{
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	
}
System.out.println(rev);
if(sum == rev)
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not a palindrome");
}





	}

}
