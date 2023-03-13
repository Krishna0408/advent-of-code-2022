import java.util.*;
class metastring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        int n=ch1.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(ch1[i]!=ch2[i])
            {
              count++;
            }
        }

        System.out.print("the ans is : " +((count==2)?"yes":"No"));
}
}