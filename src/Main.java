import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        int systemMonth=0;
        int year=2020;
        int firstWeekDay=2;
        int thisWeekDay=0;
        int monthExtraDay[]={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int yearDay=0;

        System.out.println("Alert year");
        year=scan.nextInt();
        scan.nextLine();
        System.out.println("Alert month");
        if((2020-year)%4==0)
            monthExtraDay[2]=29;
        switch (scan.nextLine())
        {
            case "January": systemMonth=1; break;
            case "February": systemMonth=2; break;
            case "March": systemMonth=3; break;
            case "April": systemMonth=4; break;
            case "May": systemMonth=5; break;
            case "Jane": systemMonth=6; break;
            case "July": systemMonth=7; break;
            case "August": systemMonth=8; break;
            case "September": systemMonth=9; break;
            case "October": systemMonth=10; break;
            case "November": systemMonth=11; break;
            case "December": systemMonth=12; break;
        }
        for(int month=0; month<systemMonth; month++)
        {
            yearDay+=monthExtraDay[month];
        }
        thisWeekDay=(yearDay+firstWeekDay)%7+1;
        System.out.println("  M  T  W  T  F  S  S");
        for(int day=1; day-thisWeekDay<monthExtraDay[systemMonth]; day++)
        {
            if(day<thisWeekDay)
                System.out.print("   ");
            else
            {
                if(day-thisWeekDay+1<10)
                    System.out.print(" ");
                System.out.print(" "+(day-thisWeekDay+1));
            }
            if(day%7==0)
                System.out.println("");
        }
    }
}
