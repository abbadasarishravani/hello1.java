//This program is to print sum of n natural numbers
import java.io.*;
import java.util.Scanner;
class sum1
{
public static void main(String args[])
{
System.out.print("Enter n value:");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i =1;
int sum =0;
while(i<=n)
{
sum = sum+i;
i++;
}
System.out.println("The sum is:" + sum);
}
}

