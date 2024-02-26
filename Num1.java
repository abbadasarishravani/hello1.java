//This program is to print 1 to n natural numbers
import java.io.*;
import java.util.Scanner;
class num1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i=1;
System.out.println("The numbers are:" );
while(i<=n)
{
System.out.println(i);
i++;
}
}//main
}//num1