import java.util.*;
public class p7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x;
        for(int i=1;i<=n;i++)
        {
            x=i;
             for(int j=1;j<=n;j++)
             {
                 System.out.print(x+" ");
                 x+=n;
             }
             System.out.println();
        }
    }
}
