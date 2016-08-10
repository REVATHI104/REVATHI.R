import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		while((n !=2 && n % 2 == 0) || n ==1){
          n = n /2;
        }
		 if(n%2==0){
       	  System.out.println("It is the power of two");
         }else{
       	  System.out.println("Its is not the power of two");
         }
        
  }
}
