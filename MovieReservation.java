import java.util.*;
class MovieReservation
{
    String a[][] = new String[10][10];
    int seats;//Number of seats;
    String movieName;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter The Movie Name");
        movieName = sc.nextLine();
        radom();print();
        System.out.println("Enter The Number of Seats");
        seats = sc.nextInt();
    }
    public static void main()
    {
        MovieReservation ob = new MovieReservation();
        ob.input();
        ob.reservation();
        ob.print2();
    }
    void reservation()
    {
        System.out.println("Enter Row");
        int r =sc.nextInt();
        System.out.println("Enter Coloumn");
        int c =sc.nextInt();int row = r-1;int col=c-1;
        for(int i=1;i<=seats;i++)
        {
            a[row][col]="* ";col++;
        }
    }
    
    void print()
    {
        System.out.println("     Screen Facing This side    ");
        System.out.println("Coloumn");
        System.out.print("     ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print((i+1)+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(j==0)
                {
                    System.out.print("Row " +(i+1));
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Movie Name "+movieName);
        System.out.println("."+" Availabe Seats");
        System.out.println("|"+" Reserved Seats");
    }
    void print2()
    {
        System.out.println("     Screen Facing This side    ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Movie Name "+movieName);
        System.out.println("."+" Availabe Seats");
        System.out.println("|"+" Reserved Seats");
        System.out.println("*"+" Your Seats");
    }
    int radomn()
    {
        int r = (int)(Math.random()*a.length);
        return r;
    }
    void radom()
    {
        for(int i=0;i<a.length/2;i++)
        {
            for(int j=0;j<a.length/2;j++)
            {
                a[radomn()][radomn()] ="| ";
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i][j]==null)
                {
                    a[i][j]=". ";
                }
            }
        }
    }
}