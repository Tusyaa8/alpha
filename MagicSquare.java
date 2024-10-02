import java.util.*;
class MagicSquare
{
    int a[][];int constant;//datamember
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        a = new int[n][n];
        System.out.println("Enter The Elements");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void main()
    {
        MagicSquare ob = new MagicSquare();
        ob.input();
        ob.print();
        if(ob.isMagic())
        {
            System.out.println("Magic Square");
        }
        else
        {
            System.out.println("Not A Magic Square");
        }
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
    void constant()
    {
        for(int i=0;i<a.length;i++)
        {
            constant+=a[i][0];
        }
    }
    boolean isMagic()
    {
        int sumR=0,sumC=0,sumLd=0,sumRd=0;boolean isMagic = true;constant();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                sumR+=a[i][j];sumC+=a[j][i];
                if(i==j)
                {
                    sumLd+=a[i][j];
                }
                if(i+j==a.length-1)
                {
                    sumRd+=a[i][j];
                }
            }
            if(sumR==sumC)
            {
                if(sumLd==sumRd)
                {
                    if(sumLd==constant)
                    {
                        sumR=0;sumC=0;sumLd=0;sumRd=0;
                        continue;
                    }
                    else
                    {
                        isMagic = false;
                    }
                }
                else
                {
                    isMagic = false;
                }
            }
            else
            {
                isMagic =false;
            }
            sumR=0;sumC=0;sumLd=0;sumRd=0;
        }
        return isMagic;
    }
}