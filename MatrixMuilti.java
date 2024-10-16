import java.util.*;
class MatrixMuilti
{
    void print(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        MatrixMuilti  ob = new MatrixMuilti();
        System.out.println("Enter Size of Matrix 1");
        System.out.println("Row");
        int r1 = sc.nextInt();
        System.out.println("Column");
        int c1 = sc.nextInt();
        System.out.println("Enter Elements");
        int m1[][] = new int[r1][c1];
        m1 = ob.input(m1);
        System.out.println("Enter Size of Matrix 2");
        System.out.println("Row");
        int r2 = sc.nextInt();
        System.out.println("Column");
        int c2 = sc.nextInt();
        System.out.println("Enter Elements");
        int m2[][] = new int[r1][c1];
        m2 = ob.input(m2);
        ob.print(m1);
        System.out.println();
        ob.print(m2);
        if(c1==r2)
        {

            for(int i=0;i<m1.length;i++)
            {
                for(int z=0;z<m1[0].length;z++)
                {
                    int sumr=0;
                    for(int j=0;j<m2.length;j++)
                    {

                        for(int k=0;k<m2[0].length;k++)
                        {
                            sumr+=m1[i][z]*m2[j][k];
                        }

                    }
                    System.out.println(sumr);
                }

            }
        }
        else
        {
            System.out.println("Matrix Multipy is not possible");
        }
    }

    int[][] input(int a[][])
    {
        Scanner sc  = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
}