package com.capgcorejava.LabBook1;
import java.util.*;
public class LabBook1E5 {
	static int sum=0;
static public int calculateSum (int n) {
for(int i=1;i<=n;i++)
	if(i%3==0||i%5==0)
		sum+=i;
	
	return sum;
}
	public static void main(String[] args) {
		System.out.println("Enter any natural number");
		Scanner sc=new Scanner(System.in);
		calculateSum(sc.nextInt());
		System.out.println("Sum = "+sum);
		sc.close();
	}

}
