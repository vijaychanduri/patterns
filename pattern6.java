import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=i;
            int y=n-i+1;
            for(int j=1;j<=n;j++)
            {
                if(j%2==1)
                {
                    System.out.print(x);
                }else{
                    System.out.print(y);
                }
                x+=n;
                y+=n;
            }
            System.out.println();
        }  
      }
}
