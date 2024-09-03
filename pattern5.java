import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int count=i;
            for(int j=1;j<=n;j++)
            {
               System.out.print(count);
               count+=n;
            }
         System.out.println();
        }
    }
}
