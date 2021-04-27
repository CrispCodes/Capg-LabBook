package com.capgcorejava.LabBook1;
import java.util.*;
public class LabBook1E8 {
static boolean checkNumber (int num) {
	while(num!=1) {
		if(num>=2&&num%2==0) {
			num/=2;
			continue;
		}
		else break;
	}
	if(num==1)
	return true;
	else 
		return false;
}
	public static void main(String[] args) {
System.out.println("Enter any Number: ");
Scanner sc=new Scanner(System.in);
if(checkNumber(sc.nextInt()))
	System.out.println("Given Number is a power of 2");
else
	System.out.println("Given Number is not a power of 2");
	}

}
