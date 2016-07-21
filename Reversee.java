import java.util.*;
public class Reversee {


	public static void main(String[] args) {
		
	
				Scanner input=new Scanner(System.in);
				System.out.println("enter the number of range");
				int s=input.nextInt();
				int count=0;
		        int d=0;
		        int mo=0;
		       for(int i=0;i<=s;i++)
		       {
						d=i/10;
						mo=i%10;
						if(d==2)
						{
						 count++;
						}
						 if(mo==2)
						{
							count++;
							
						}
						
					}
				System.out.println("count is : "+count);
			}
		}
