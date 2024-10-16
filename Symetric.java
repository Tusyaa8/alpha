import java.util.*;
class Symetric
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int a[][]= new int [n][n];
        System.out.println("Enter The Elements");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        boolean isSymetric = true;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
                if(a[i][j]!=a[i][j])
                {
                    isSymetric= false;
                }
            }
            System.out.println();
        }
        if(isSymetric)
        {
            System.out.println("Symetric Matrix");
        }
        else
        {
            System.out.println("Not Symetric Matrix");
        }
    }
}