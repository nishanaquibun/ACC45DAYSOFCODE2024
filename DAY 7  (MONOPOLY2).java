import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,p, q ,r, s;
		Scanner sc=new Scanner
		     (System.in);
		  t=sc.nextInt();
		  for(int i=0;i<t;i++)
		  {
		     p=sc.nextInt();
		     q=sc.nextInt();
		     r=sc.nextInt();
		     s=sc.nextInt();
		   if((p>q+r+s) ||(q>p+r+s) ||(r>p+q+s) ||(s>p+q+r))
		   System.out.println("Yes");
		   else
		   System.out.println("No");
	}
}
}
		     
		     
		    
		

	

