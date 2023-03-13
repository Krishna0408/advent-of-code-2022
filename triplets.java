import java.util.*;

public class triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int a[] =new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                int k=a[i]+a[j];
                if(k==a[j+1]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
