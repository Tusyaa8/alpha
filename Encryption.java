import java.util.*;
class Encryption
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Encryption ob = new Encryption();
        System.out.println("Enter A Senetence");
        String s = sc.nextLine().toLowerCase();
        System.out.println("Enter Move Value");
        int move = sc.nextInt();
        String encrypt=ob.encryptSentence(s,move);
        System.out.println("Original Senence: "+s);
        System.out.println("Move: "+ move);
        System.out.println("Encrypt: "+encrypt);
    }
    String encrypt(String s,int n)
    {
        String result ="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if("aeiou".indexOf(ch)!=-1)
            {
                for(int j=1;j<=n;j++)
                {
                    if(ch=='a')
                    {
                        ch='z';
                    }
                    else
                    {
                        ch--;
                    }
                }
            }
            else
            {
                for(int j=1;j<=n;j++)
                {
                    if(ch=='z')
                    {
                        ch='a';
                    }
                    else
                    {
                        ch++;
                    }
                }
            }
            result+=ch+"";
        }
        return result;
    }
    String encryptSentence(String s,int move)
    {
        StringTokenizer ob = new StringTokenizer(s,". , : ; \' ?");
        String result ="";
        while(ob.hasMoreTokens())
        {
            String temp = ob.nextToken();
            String temp2 = encrypt(temp,move);
            result+=temp2+" ";
        }
        result=result.trim();
        return result;
    }
}