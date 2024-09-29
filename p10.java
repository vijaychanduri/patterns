import java.util.*;
public class p10 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x;
        int y;
        for(int i=n;i>=1;i--)
        {
            x=i;
            y=n-i+1;
            for(int j=1;j<=n;j++)
            {
                if(j%2==0)
                System.out.print(y+" ");
                else{
                    System.out.print(x+" ");
                } 
                x+=n;
                y+=n;
            }
            System.out.println();
        }
    }
}
