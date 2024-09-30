import java.util.*;
class MagicSquareInput
{
    int a[][];int constant;
    int length;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int n = sc.nextInt();length=n;
        a = new int[n][n];constant=n*((n*n)+1)/2;
    }
    public static void main()
    {
        MagicSquareInput ob = new MagicSquareInput();
        ob.input();
        ob.generateMagic();
        ob.print();
    }
    void print()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void generateMagic()
    {
        int magic =2;int i=0,j =length/2;
        a[i][j]=1;
        while(magic<=(length*length))
        {
            if((i-1)==-1)
            {
                int y=j;
                i=length-1;j++;
                if(j>=length&&a[i][0]!=0)
                {
                    j=0;a[i][j]=magic;magic++;
                }
                else if(j<length&&a[i][j]!=0)
                {
                    a[i][j]=magic;magic++;
                }
                else if(j<length&&a[i][j]==0)
                {
                    a[i][y]=magic;magic++;
                }
            }
            else
            {
                int x =i,y=j;
                i--;j++;
                if(j>=length&&a[i][0]!=0)
                {
                    j=0;a[i][j]=magic;magic++;
                }
                else if(j<length&&a[i][j]!=0)
                {
                    a[i][j]=magic;magic++;
                }
                else if(j<length&&a[i][j]==0)
                {
                    a[x][y]=magic;magic++;
                }
            }
        }
    }
}
