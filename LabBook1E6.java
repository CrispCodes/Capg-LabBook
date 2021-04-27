package com.capgcorejava.LabBook1;
import java.util.*;
import java.util.Scanner;
public class LabBook1E6 {
	static int result1=0,result2=0,difference;
	static int calculateDifference(int n) {
		for(int i=1;i<=n;i++)
			result1+=i*i;
		for(int i=1;i<=n;i++)
			result2+=i;
		difference=result1-result2*result2;
		return 1;
	}

	public static void main(String[] args) {
		System.out.println("Enter any natural number");
		Scanner sc=new Scanner(System.in);
		calculateDifference (sc.nextInt());
		System.out.println("Difference = "+difference);
		sc.close();
	}

}
