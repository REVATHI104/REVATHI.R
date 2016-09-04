import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
import java.util.Scanner;  
public class kj {  
public static void main(String a[]) {  
Scanner ta=new Scanner(System.in);  
System.out.println("String:");  
String str=ta.nextLine();  
System.out.println("length");  
int count=ta.nextInt();
List<String> list=new ArrayList<String>();  
for (int a1=0;a1<str.length();a1 = a1 + 1) 
{  
if (str.length()-a1>=count) 
{  
list.add(str.substring(a1,count + a1));  
}  
}  
Collections.sort(list);  
System.out.println("Largest subString:" + list.get(list.size() - 1));  
}  
}  
