import java.util.Scanner; 
import java.io.*;
public class Main
{
    
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String  a =sc.nextLine();  

int i=0;
int j=0;
StringBuilder ob = new StringBuilder();
ob.append(s.charAt(j));
while(i<a.length())
{

if(a.charAt(i)==' ' && ob.charAt(j)==' ')
{
i=i+1;
continue;
}
else
{
ob.append(a.charAt(i));
j=j+1;
i=i+1;
}


}
System.out.println(ob);

}

}
