import java.util.*;

class vowelsreverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char temp;
        String a=sc.nextLine();
        char n[]=a.toCharArray();
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]=='a' || n[i]=='e' || n[i]=='i' || n[i]=='o' || n[i]=='u'){
                if(n[j]=='a' || n[j]=='e' || n[j]=='i' || n[j]=='o' || n[j]=='u'){
                temp=n[i];
                n[i]=n[j];
                n[j]=temp;
                i++;
              }
           }
         }
        }
        for(int i=0;i<n.length;i++){
        System.out.printf("%c",n[i]);
        }
    }
}
