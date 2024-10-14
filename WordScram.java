import java.util.*;
class WordScram
{
    char random()
    {
        char k =(char)(Math.random()*('Z'-'A')+'A');
        return k;
    }
    public static void main()
    {
        WordScram ob = new WordScram();
        Scanner sc = new Scanner(System.in);
        char ch[][] = new char[9][9];
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch[0].length;j++)
            {
                ch[i][j] = ob.random();
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch[0].length;j++)
            {
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter The Word To Search");
        String search = sc.next().trim().toUpperCase();
        StringBuffer sr = new StringBuffer(search);sr.reverse();
        String rightDigonal="",leftDigonal="";
        for(int i=0;i<ch.length;i++)
        {
            String row="",col="";
            for(int j=0;j<ch[0].length;j++)
            {
                row+=ch[i][j]+"";col+=ch[j][i]+"";
                if(i==j)
                {
                    leftDigonal+=ch[i][j]+"";
                }
                else if((i+j)==ch.length-1)
                {
                    rightDigonal+=ch[i][j]+"";
                }
            }
            StringBuffer rowB = new StringBuffer(row);
            rowB.reverse();
            StringBuffer colB = new StringBuffer(col);
            colB.reverse();
            if(row.indexOf(search)!=-1||rowB.toString().indexOf(search)!=-1)
            {
                System.out.println("Element Present In Row "+(i+1));
            }
            else if(col.indexOf(search)!=-1||colB.toString().indexOf(search)!=-1)
            {
                System.out.println("Element Present In Column "+(i+1));
            }
            else if(row.indexOf(sr.toString())!=-1||rowB.toString().indexOf(sr.toString())!=-1)
            {
                System.out.println("Element Present In Row "+(i+1));
            }
            else if(col.indexOf(search)!=-1||colB.toString().indexOf(sr.toString())!=-1)
            {
                System.out.println("Element Present In Column "+(i+1));
            }
        }
        StringBuffer rdB = new StringBuffer(rightDigonal);
        rdB.reverse();
        StringBuffer ldB = new StringBuffer(leftDigonal);
        ldB.reverse();
        if(rightDigonal.indexOf(search)!=-1||rdB.toString().indexOf(search)!=-1)
        {
            System.out.println("Element Present In Righ Digonal");
        }
        else if(leftDigonal.indexOf(search)!=-1||ldB.toString().indexOf(search)!=-1)
        {
            System.out.println("Element Present In Left Digonal");
        }
        else if(rightDigonal.indexOf(search)!=-1||rdB.toString().indexOf(sr.toString())!=-1)
        {
            System.out.println("Element Present In Righ Digonal");
        }
        else if(leftDigonal.indexOf(search)!=-1||ldB.toString().indexOf(sr.toString())!=-1)
        {
            System.out.println("Element Present In Left Digonal");
        }
    }
}