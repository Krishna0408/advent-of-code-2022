import java.util.*;

public class day3_rucksack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int a=0;
        while(n!=0){
        String s=sc.next();
        int b=s.length();
        String s1=s.substring(0,b/2);
        String s2=s.substring(b/2);
        //System.out.println(s1 +"\n"+s2);
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            String s3 = "";
            for (int i = 0; i < arr1.length; i++) {
                char c = arr1[i];
                if (new String(arr2).contains(String.valueOf(c))) {
                    if (s3.contains(String.valueOf(c)) == false) {
                        s3 += c;
                    }
                }
            }
           // System.out.println(s3);
        
        
        char letter = s3.charAt(0);
int value=0;

if (letter >= 'a' && letter <= 'z') {
    value = letter - 'a' + 1;
} else if (letter >= 'A' && letter <= 'Z') {
    value = letter - 'A' + 27;
} 

a=a+value;
 n--;
        }
        System.out.println(a);
    }
    }   
    
