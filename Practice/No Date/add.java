import java.util.*;
import java.lang.*;
import java.io.*;

class add
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
	    
		int n=sc.nextInt();
		int fVal=n;
		if (n>1) {
            for (int i=1;i<=n ;i++ ){
		    fVal+=2;
		}
        }
		System.out.println("Output: "+fVal);
		} 
	}

