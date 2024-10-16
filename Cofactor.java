import java.util.*;
class Cofactor
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] =sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter The Element");
        int se = sc.nextInt();
        int b[][] = new int[n-1][n-1]; int cont=-1;
        outer :for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==se)
                {
                    cont = (int)(Math.pow(cont,i+j));
                    for(int x=0;x<n;x++)
                    {
                        a[i][x] =0;
                    }
                    for(int x=0;x<n;x++)
                    {
                        a[x][j] =0;
                    }
                    break outer;
                }
            }
        }
        int x =0,y=0;
        outer:for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(y==b.length)
                {
                    x++;y=0;
                }
                if(x==b.length)
                {
                    break outer;
                }
                if(a[i][j]!=0)
                {
                    b[x][y] = a[i][j];y++;
                }
            }
        }
        int sumR =1,sumL=1;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(i==j)
                {
                    sumL*=b[i][j];
                }
                else if((i+j)==(b.length-1))
                {
                    sumR*=b[i][j];
                }
            }
        }
        int diff= sumL-sumR;
        System.out.println("Co Factor");
        System.out.println(diff*cont);
    }
}