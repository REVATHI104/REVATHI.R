
public class Fact {

	public static void main(String[] args) {
int n=Integer.parseInt(args[0]);
int fact=1;
for(int i=n;i>0;i--)
{
	fact=fact*n;
	--n;
}
System.out.println(fact);
	}

}
