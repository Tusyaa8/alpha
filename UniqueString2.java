import java.util.*;
class UniqueString2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        UniqueString2 ob = new UniqueString2();
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
        System.out.println("Unique Words Vowel");
        for(int i=0;i<a.length;i++)
        {
            if(ob.isUnique(a[i]))
            {
                System.out.println(a[i]);
            }
        }
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
    boolean isUnique(String s)
    {
        int k = s.length()-1;
        int mid = k/2;
        String v ="aeiou";
        return (v.indexOf(s.charAt(k))!=-1&v.indexOf(s.charAt(mid))!=-1&v.indexOf(s.charAt(0))!=-1);
    }
}
