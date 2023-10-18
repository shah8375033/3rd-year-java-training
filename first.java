import java.util.*;
public class first
{
public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        int n,z,y;
        System.out.println("enter n");
        n=sc.nextInt();
        z =sum(n);
        System.out.println(z);
        y=reverse(n);
        System.out.println(y);
        if(y==n){System.out.println("it is palindrome");}
}
/*101010
  101010
  101010*/
public static void pat3(int n)
{
    for(int i=1;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if (j%2==0)
            System.out.print("1");
            else
            System.out.print("0");
        }
        System.out.println();
    }
}
/* 1
 * 12
 * 123
 * 1234
 */
public static void pat2(int n)
{
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}
/* 1234
 * 123
 * 12
 * 1
 */
public static void pat1(int n)
{
    for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
}
public static void pat(int n)
{
    for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
}
public static int reverse (int n)
{
    int a,rev=0;
    while(n>0)
    {
        a=n%10;
        n=n/10;
        rev=a+(10*rev);
    }
    return rev;
}

public static int sum(int n)
{
    int s=0,a;
    while(n>0)
    {

        a=n%10;
        n=n/10;
        s=s+a;
    }
    return s;
}    
}