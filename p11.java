import java.util.*;
public class p11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x;
        for(int i=1;i<=n;i++)
        {
            x=i;
            for(int j=0;j<=n;j++)
            {
                System.out.print(x);
                x+=1;
            }
            System.out.println();
        }
    }

}
