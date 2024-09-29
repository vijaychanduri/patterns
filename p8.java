import java.util.*;
public class p8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x;
        int y;
        for(int i=1;i<=n;i++)
        {
            x=n-i+1;
            y=i;
            for(int j=1;j<=n;j++)
            {
                if(j%2==0)
                System.out.print(x+" ");
                else{
                    System.out.print(y+" ");
                }
                x+=n;
                y+=n;

            }
            System.out.println();
        }
    }
}
