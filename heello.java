import java.util.*;
public class hello
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<0)
{
System.out.println("Negative");
}
else if(n>0)
{
System.out.println("Positive");
}
else
{
System.out.println("Zero");
}
}
}
