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
        int i=0,j =length/2;
        for(int magic =1;magic<=length*length;magic++)
        {
            a[i][j]=magic;
            if(magic%length==0)
            {
                i++;
            }
            else
            {
                if(i==0)
                {
                    i=length-1;
                }
                else
                {
                    i--;
                }
                if(j==length-1)
                {
                    j=0;
                }
                else
                {
                    j++;
                }
            }
        }
    }
}
