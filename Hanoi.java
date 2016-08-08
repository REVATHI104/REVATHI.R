import java.io.*;
import java.util.*;
class Hanoi
{
    static void HanoiLogic(int num,char x,char y,char z)
    {
        if(num==1)
        {
            System.out.println("MOVING DISK 1 FROM "+x+" TO "+y);
            return;
        }
        HanoiLogic(num-1,x,y,z);
        System.out.println("MOVING DISK "+num+" FROM "+x+" TO "+y);
        HanoiLogic(num-1,z,y,x);
    }
    public static void main(String[] args)
    {
        int nums;
        char A='A',B='B',C='C';
        System.out.println("ENTER NO OF DISK:");
        Scanner s=new Scanner(System.in);
        nums=s.nextInt();
        HanoiLogic(nums,A,B,C);
    }
}
