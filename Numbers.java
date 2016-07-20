public class Numbers {

	public static void main(String[] args) {
		
		String[] string = args[0].split("");
	
		int[] a = new int[args.length];
		
		for(int i=0;i<a.length;i++)
		{
			 a[i]=Integer.parseInt(string[i]);
		
		
		}
		for(int i=0;i<a.length;i++)
		{
		
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[j]);
			}
			
		}
			
		}

	}

}
