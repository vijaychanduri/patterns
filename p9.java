import java.util.*;
public class p9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x;
        for(int i=n;i>=1;i--)
        {
            x=i;
            for(int j=n;j>=1;j--)
            {
                System.out.print(x+" ");
                x+=n;
            }
            System.out.println();
        }
    }
}
