import java.util.*;
class UniqueString
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        UniqueString ob = new UniqueString();
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println("Enter The Words");
        String a[] = new String[n];
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.next().toLowerCase();
        }
        int product=1;
        for(int i=0;i<a.length;i++)
        {
            if(ob.isUniqueWord(a[i]))
            {
                product*=a[i].length();System.out.println(a[i]);
            }
        }
        product=(product==1)?0:product;
        System.out.println("Product "+product);
    }
    boolean isUniqueWord(String s)
    {
        String wd ="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(wd.indexOf(ch)==-1)
            {
                wd+=ch+"";
            }
        }
        return (wd.equals(s));
    }
}