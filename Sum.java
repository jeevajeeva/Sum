# Sum
import java.io.*;
import java.util.*;
public class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=0,sum=0;
System.out.println("Enter integer");
int n=sc.nextInt();
for(;i<=n;)
{
sum=sum+i;
i++;
}
System.out.println(sum);
}
}
