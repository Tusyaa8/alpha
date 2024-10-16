import java.util.*;
class SudokoInput
{
    int a[][] = new int[9][9];//Data members
    int randomNumber()
    {
        return (int)(Math.random()*(9-1+1))+1;
    }//Genrates random numbers from 1-9
    int randomIndex()
    {
        return (int)(Math.random()*(8-0+1))+0;
    }//Genrates random Index from 0-8
    boolean grid(int a[][],int r,int c,int rad)
    {
        int startx = (r/3)*3;
        int starty = (c/3)*3;
        for(int i=startx;i<(startx+3);i++)
        {
            for(int j=starty;j<(starty+3);j++)
            {
                if(a[i][j]==rad)
                {
                    return true;
                }
            }
        }
        return false;
    }//Checks Whether if The element is present in bocx 3*3
    public static void main()
    {
        SudokoInput ob  = new SudokoInput();
        ob.sudokuGenerator();
        ob.printBox();
        ob.answer();
        ob.printBox();
    }//Main Method
    void answer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements from row 1 to Last row");
        System.out.println("Travelling to left to right side");
        System.out.println("Type 10 to Terminate and Restrart");
        out:for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i][j]==0)
                {
                    int n = sc.nextInt();
                    if(n==10)
                    {
                        break out;
                    }
                    if(!isRow(a,i,n)&&!isColm(a,j,n)&&!grid(a,i,j,n))
                    {
                        a[i][j]=n;
                    }
                    else
                    {
                        System.out.println("Element is There Already");
                        System.out.println("Try Other Element");i--;j--;
                        if(j<=0)
                        {
                            j=0;
                        }
                        else if(i<=0)
                        {
                            i=0;
                        }
                    }
                }                
            }
        }
    }
    void sudokuGenerator()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                int rad = randomNumber();
                int x = randomIndex();
                int y = randomIndex();
                if(!isRow(a,x,rad)&&!isColm(a,y,rad)&&!grid(a,x,y,rad))
                {
                    a[x][y] = rad;
                }
            }
        }
    }//Generates Sudoku Questions
    boolean isRow(int a[][],int r,int rad)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[r][i]==rad)
            {
                return true;
            }
        }
        return false;
    }//Checks Whether if The element is present in row
    boolean isColm(int a[][],int c,int rad)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i][c]==rad)
            {
                return true;
            }
        }
        return false;
    }//Checks Whether if The element is present in coloumn
    void printBox()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if((j+1)%3==0)
                {
                    if(a[i][j]==0)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print(a[i][j]);
                    }
                    System.out.print("|");
                }
                else
                {
                    if(a[i][j]==0)
                    {
                        System.out.print("  ");
                    }
                    else
                    {
                        System.out.print(a[i][j]+" ");
                    }
                }
            }
            System.out.println();
            if((i+1)%3==0)
            {
                for(int k=0;k<a.length;k++)
                {
                    System.out.print("- ");
                }
                System.out.println();
            }
        }
    }//Sukudo Printing Method
}//class
