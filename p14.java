import java.util.*;
public class p14 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2==1)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(0+" ");
                }
            }else{
            for(int j=1;j<=n;j++)
            {
                System.out.print((i+j)%2+" ");
            }
        }
            System.out.println();
        }
    }
}
