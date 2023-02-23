import java.util.*;
public class day1{
	
    public static void main(String args[])
    {
        int a[][]= {{1000,2000,3000},{4000},{6000,5000},{9000,7000,8000},{10000}};
        int b[]= new int[a.length];
        int i,j;
        int sum=0; 
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                sum=sum+a[i][j];
                b[i]=sum;   
            }	
            sum=0;
        }
        System.out.println(Arrays.toString(b));
            int max=b[0]; 
            int index=0;   
            for (i=0;i<b.length;i++){  
                if(b[i] > max)  
                max = b[i];
                index=i;
            }
            System.out.println(index +"th has highest calorie of "+max);
    }
}
