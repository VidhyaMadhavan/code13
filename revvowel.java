import java.lang.*;
import java.util.*;
class revvowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str,revstr=" ",remstr=" ";
str=sc.nextLine();
int len=str.length();
for(int i=len;i>0;i--)
{
revstr +=str.charAt(i-1);
}
System.out.println(revstr);
remstr=revstr.replaceAll("[aeiou]","");
System.out.println(remstr);
}
}

