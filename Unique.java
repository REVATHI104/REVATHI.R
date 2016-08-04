import java.util.Scanner;

public class Unique {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of value : ");
        int l = sc.nextInt();
        int ar[] = new int[l];
        int n = ar[0];
        int count;
        System.out.println("Enter the values : ");
        for (int i = 0; i < l; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            count = 0;
            for(int j = 0; j < l; j++) {
                if(ar[i] == ar[j])
                    count++;
            }
            if(count == 1) {
                n = ar[i];
                break;
            }
        }
        System.out.print(n);
    }
}
