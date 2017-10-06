import java.util.*;
class Palindrome
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a String");
String a=s.next();
int n=a.length();
int j=n-1;
boolean f=true;
for(int i=0;i<n/2;i++)
{
if(a.charAt(i)!=a.charAt(j))
{
f=false;
break;
}
j--;
}
if(f==true)
System.out.println("Palindrome");
else
System.out.println("Not a Palindrome");
}
}