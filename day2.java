import java.util.*;
public class day2
{
	public static void main(String args[])
	{
    Scanner s=new Scanner(System.in);
    int n=3;
    int sum=0,sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0;
	char a,b;
while(n!=0)
{
   a=s.next().charAt(0);
   b=s.next().charAt(0);
 if(a=='A' && b=='X')
 {
     sum=1+3;
        
 }
else if(a=='A' && b=='Y')
{
   sum1=2+6;
 }
 else if(a=='A' && b=='Z')
{
    sum2=3+0;
}
else if(a=='B' && b=='X')
{
    sum3=1+0;
}
else if(a=='B' && b=='Y')
{
    sum4=2+3;
} 
else if(a=='B' && b=='Z')
{
    sum5=3+6;
}
else if(a=='C' && b=='X')
{
    sum6=1+6;
}
else if(a=='C' && b=='Y')
{
    sum7=2+0;
}
else if(a=='C' && b=='Z')
{
    sum8=3+3;
}
n--;
}
int ans=sum+sum1+sum2+sum3+sum4+sum5+sum6+sum7+sum8;
System.out.println(ans);
}
}
