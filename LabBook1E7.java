package com.capgcorejava.LabBook1;
import java.util.*;
public class LabBook1E7 {
	static boolean checkNumber (int num) {
		int a,b;
		while(num!=0) {
			a=num%10;
			num/=10;
			b=num%10;
			if(a>=b)
				continue;
			else 
				break;
		}
		if(num==0)
		return true;
		else 
			return false;
	}

	public static void main(String[] args) {

System.out.println("Enter any Number: ");
Scanner sc=new Scanner(System.in);
if(checkNumber (sc.nextInt()))
	System.out.println("Given Number is an Increasing Number");
else
	System.out.println("Given Number is not an Increasing Number");
	}

}

// Alternative way using String
/*
public class LabBook1E7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
	boolean b=checkNumber(n);
	System.out.println(b);
	}
	public static boolean checkNumber(int n)
	{
	    String s=Integer.toString(n);
	    for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        
	        if(i!=s.length()-1 )
	        {
	              char ch1=s.charAt(i+1);
	              if(ch<=ch1)
	              continue;
	              else
	              {
	                  return false;
	              }
	        }
	        
	    }
	    return true;
	}

}
*/
