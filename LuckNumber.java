import java.util.*;
class LuckNumber
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        LuckNumber ob = new LuckNumber();
        System.out.println("Enter Range");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i] = i+1;
        }
        int k =2;
        while(k<a.length)
        {
            a = ob.delI(a,k);
            a = ob.del(a);k++;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                System.out.println(a[i]);
            }
        }
    }
    int[] del(int a[])
    {
        int k[]=new int[a.length];int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                k[j]=a[i];j++;
            }
        }
        return k;
    }
    int[] delI(int a[],int k)
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
}