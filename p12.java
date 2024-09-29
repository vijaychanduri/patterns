import java.util.*;
public class p12 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
           System.out.print(2*(i+j)-3+" ");
        }
        System.out.println();
    }
}
    
}
