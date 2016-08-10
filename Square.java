import java.util.*;
import java.lang.*;
import java.io.*;

class Square
{
	static double calcDist(int x1, int y1, int x2, int y2)
	{
		double d;
		double dist;
		d = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
		dist = Math.pow(d, 0.5);
		return dist;
	}
	public static void main (String[] args) 
	{
		int x1, y1, x2, y2, x3, y3, x4, y4;
		double a1, a2, a3, a4;
		Scanner num = new Scanner(System.in);
		x1 = num.nextInt();
		y1 = num.nextInt();
		x2 = num.nextInt();
		y2 = num.nextInt();
		x3 = num.nextInt();
		y3 = num.nextInt();
		x4 = num.nextInt();
		y4 = num.nextInt();
		a1 = calcDist(x1, y1, x2, y2);
		a2 = calcDist(x2, y2, x3, y3);
		a3 = calcDist(x3, y3, x4, y4);
		a4 = calcDist(x4, y4, x1, y1);
		if((a1 == a2) && (a2 == a3) && (a3 == a4) && (a4 == a1))
			System.out.println("Square");
		else
			System.out.println("Not square");
		
	}
}
