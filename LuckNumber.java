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
        for(int i=0;i<a.length;i++)
        {
            if((i+1)%2==0)
            {
                a[i]=0;
            }
        }
        a= ob.del(a);
        for(int i=0;i<a.length;i++)
        {
            if((i+1)%3==0)
            {
                a[i]=0;
            }
        }
        a= ob.del(a);
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
}