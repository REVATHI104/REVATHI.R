import java.util.Scanner;


	public class pyr{
		public static void main(String [ ] arg){
			int n,b=0;
			Scanner pyr = new Scanner(System.in);
			int tmp=0,temp=0;
			n=pyr.nextInt();
			
		for(int i=0;i<n;i++)
		{
			tmp=temp;
		b++;
			for(int a=0;a<n-i-1;a++)
			{
				System.out.print("  ");
			}
				for(int j=0;j<b;j++)
				{
					
					if(j<=b/2)
					{
						tmp++;
						if(tmp==10)
						{
							tmp=0;
						}
					
					System.out.print((tmp)+" ");
					if(j==(b/2))
					{
						temp=tmp;
					}
					}	
					else{
						tmp--;
						if(tmp<0)
						{
							tmp=9;
						}
						System.out.print((tmp)+" ");
						
						
					}
					
						
				
			
		}
		System.out.println();
	b++;
		}

	}
	}
