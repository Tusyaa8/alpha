import java.util.*;
class Calender
{
    int year;
    int month;
    String allmonth[] = {"JANUARY","FEBRUARY","MARCH",
                         "APRIL","MAY","JUNE","JULY",
                         "AUGUST","SEPTEMBER","OCTOBER",
                         "NOVEMBER","DECEMBER"};
    String days[] = {"MON","TUES","WED","THU","FRI","SAT"};
    int day[] = new int[allmonth.length];
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year");
        year = sc.nextInt();
        System.out.println("Enter The Month");
        month = sc.nextInt();
        System.out.println(allmonth[month-1]);
    }
    void printCalender()
    {
        for(int i=0;i<days.length;i++)
        {
            System.out.print(days[i]);
        }
        for(int i=0;i<day.length;i++)
        {
            if(i%2==0)
            {
                day[i]=31;
            }
            else
            {
                day[i] = 30;
            }
        }
    }
    int calender()
    {
        if(year%4==0)
        {
            day[1]=29;
        }
        else if(year%100==0&&year%400==0)
        {
            day[1]=29;
        }
        else
        {
            day[1]=28;
        }
        int k = year%100;
        int j = year/100;
        int f = 1+(13*(month+1))/5+k+(k/4)+(j/4)+5*j;
        return f%7;
    }
    public static void main()
    {
        Calender ob = new Calender();
        ob.input();
        
    }
}