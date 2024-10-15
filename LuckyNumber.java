import java.util.*;
class LuckyNumber
{
    public static void main()
    {
        LuckyNumber ob = new LuckyNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int n = sc.nextInt();
        int a[] = new int[n];
        int limit = n/2;
        for(int i=0;i<a.length;i++)
        {
            a[i]=i+1;
        }
        int i=2;
        while(i<=limit)
        {
            a =ob.del(a,i);
            a =ob.del2(a);i++;
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                System.out.println(a[i]);
            }
        }
    }
    int[] del(int a[],int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if((i+1)%k==0)
            {
                a[i]=0;
            }
        }
        return a;
    }
    int[] del2(int a[])
    {
        int k[] = new int[a.length];
        int j =0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                k[j]=a[i];j++;
            }
        }
        return k;
    }
}