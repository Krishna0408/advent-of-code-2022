import java.util.*;

public class cash1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0){
        if(a>=2000){
        System.out.print("2000 ");
        a=a-2000;}
        else if(a>=500)
        {System.out.print("500 ");
        a=a-500;}
        else if(a>=200)
        {System.out.print("200 ");
        a=a-200;}
        else if(a>=100){System.out.print("100 ");
        a=a-100;}
        else if(a>=50){System.out.print("50 ");
        a=a-50;}
        else if(a>=20){System.out.print("20 ");
        a=a-20;}
        else if(a>=10){System.out.print("10 ");
        a=a-10;}
        else if(a>=5){System.out.print("5 ");
        a=a-5;}
        else if(a>=2){System.out.print("2 ");
        a=a-2;}
        else if(a>=0){System.out.print("1 ");
        a=a-1;}
        }
    }
}

