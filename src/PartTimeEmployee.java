
public class PartTimeEmployee extends HourlyEmployee
{
    private int hourLimit;
    
    public void setHourLimit(int lim)
    {
        hourLimit = lim;
    }
    public void addHours (int hours)
    {
        //get hours worked
        int hoursAlready = getHours();
        //if hours worked + hours you want to add > hourLimit, don't allow
        if (hoursAlready + hours > hourLimit)
            {System.out.print("Error. You've entered gone over your hourly limit for the week.");}
        else
            {addHours(hours);}
      
    }
}
