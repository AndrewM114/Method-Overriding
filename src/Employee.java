
public class Employee
{
    private int hoursWorked;
    private String name;
    
    public void setName(String nam)
    {
        name = nam;
    }
    public String getName()
    {
        return name;
    }
    public void addHours(int hours)
    {
        hoursWorked = hours;
    }
    public int getHours()
    {
        return hoursWorked;
    }
    public void resetHours()
    {
        hoursWorked = 0;
    }
    public double calculatePay()
    {
        return 0;
    }
    

}
