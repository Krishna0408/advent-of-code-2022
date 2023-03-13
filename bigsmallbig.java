import java.util.*;

public class bigsmallbig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a); 
        int[] a1=Arrays.copyOfRange(a,0, n/2);
        int[] a2=Arrays.copyOfRange(a,n/2, n);
        int[] a3=new int[n/2];
        for(int i=0;i<n/2;i++){
            a3[i]=a2[(n/2)-i-1];
        }
        for(int i=0;i<n/2;i++){
            System.out.print(a3[i]+" ");
            System.out.print(a1[i]+" ");
        }
}
}
